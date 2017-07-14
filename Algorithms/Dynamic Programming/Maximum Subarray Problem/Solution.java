
/*
https://www.hackerrank.com/challenges/maxsubarray
*/

import java.util.*;

class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while((T--)>0){
			int size = sc.nextInt();
			int arr[] = new int[size];
			for(int i=0;i<size;i++){
				arr[i] = sc.nextInt();
			}
			System.out.println(findMaxContiguousSubArray(arr)+ " "+ findMaxNonContiguousSubArray(arr));
		}
	}

	static int findMaxContiguousSubArray(int arr[]){
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;

		for(int i=0;i<arr.length;i++){
			max_ending_here = max_ending_here + arr[i];
			if(max_so_far<max_ending_here)
				max_so_far = max_ending_here;
			if(max_ending_here<0)
				max_ending_here =0;
		}
		return max_so_far;
	}

	static int findMaxNonContiguousSubArray(int arr[]){
		int sum = 0;
		boolean atLeastOnePositive = false;
		for(int i =0;i<arr.length;i++){
			if(arr[i]>0){
				atLeastOnePositive = true;
				sum = sum + arr[i];
			}
		}
		if(!atLeastOnePositive)
		{
			int largestNegative = arr[0];
			for(int i =1;i<arr.length;i++){
				if(largestNegative<arr[i])
					largestNegative = arr[i];
			}
			sum = largestNegative;
			
		}
		return sum;
	}
}
