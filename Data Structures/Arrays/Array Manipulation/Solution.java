//

import java.io.*;
import java.util.*;
// class Pair {
// 	int l, r, val;
// 	Pair(int l, int r, int val) {
// 		this.l = l;
// 		this.r = r;
// 		this.val = val;
// 	}
// }
class Solution {

	public static void main(String args[])throws IOException {
		Solution Test = new Solution();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//System.out.println(Test.findSmallestSubstring("ThisIsATestString", "TisT"));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		long arr[] = new long[n];
		long segmentTree[] = new long[2 * Test.nextPowerOf2(n) - 1];
		long lazy[] = new long[segmentTree.length];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			int val = Integer.parseInt(st.nextToken());

			Test.update(segmentTree, lazy, 0, 0, n - 1, l - 1, r - 1, val);
		}

		System.out.println(Test.query(segmentTree, lazy, 0, 0, n - 1, 0, n - 1));
	}
	public void update(long segmentTree[], long lazy[], int node, int start, int end, int l, int r, int value) {
		if (r <= 0)
			return;
		if (lazy[node] != 0) {
			segmentTree[node] += lazy[node];
			if (start != end) {
				lazy[node * 2 + 1] += lazy[node];
				lazy[node * 2 + 2] += lazy[node];
			}
			lazy[node] = 0;
		}

		if (start > end || start > r || end < l)
			return;

		if (start >= l && end <= r) {

			segmentTree[node] += value;
			if (start != end) {
				lazy[node * 2 + 1] += value;
				lazy[node * 2 + 2] += value;
			}
			return;
		}

		int mid = (start + end) >> 1;
		update(segmentTree, lazy, node * 2 + 1, start, mid, l, r, value);    // Updating left child
		update(segmentTree, lazy, node * 2 + 2, mid + 1, end, l, r, value); // Updating right child
		segmentTree[node] = Math.max(segmentTree[node * 2 + 1], segmentTree[node * 2 + 2]);
	}

	public long query(long segmentTree[], long lazy[], int node, int start, int end, int l, int r) {
		if (start > end || r < start || end < l)
			return Integer.MIN_VALUE;

		if (lazy[node] != 0) {
			segmentTree[node] += lazy[node];
			if (start != end) {
				lazy[node * 2 + 1] += lazy[node];
				lazy[node * 2 + 2] += lazy[node];
			}
			lazy[node] = 0;
		}

		if (l <= start && end <= r)
			return segmentTree[node];

		int mid = (start + end) >> 1;

		return Math.max(query(segmentTree, lazy, 2 * node+1, start, mid, l, r), query(segmentTree, lazy, 2 * node + 2, mid + 1, end, l, r));
	}


	public int nextPowerOf2(int num) {
		if (num == 0) {
			return 1;
		}
		if (num > 0 && (num & (num - 1)) == 0) {
			return num;
		}
		while ((num & (num - 1)) > 0) {
			num = num & (num - 1);
		}
		return num << 1;

	}

}

