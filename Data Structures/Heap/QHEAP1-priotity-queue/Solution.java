import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Solution{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); 
		while(T-->0){
			String input = br.readLine();
			input = input+" ";
			int query = Integer.parseInt(input.split(" ")[0]);
			switch(query)
			{
				case 1 :
					pq.add(Integer.parseInt(input.split(" ")[1]));
					continue;
				case 2 :
					pq.remove(Integer.parseInt(input.split(" ")[1]));
					continue;
				case 3 :
					System.out.println(pq.peek());
					continue;
			}
		}
	}
}
