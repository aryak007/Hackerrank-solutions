import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.StringTokenizer;
import java.util.*;

class Solution{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Character removed;
		String input = br.readLine();
		StringBuilder str = new StringBuilder(input);
		
		Deque<Character> stack = new ArrayDeque<Character>();

		stack.addFirst(str.charAt(0));

		for(int i=1;i<str.length();i++){
			if(stack.isEmpty())
				stack.addFirst(str.charAt(i));

			else
			{
					if(stack.peekFirst()==str.charAt(i)){

						removed = stack.removeFirst();
					}
					else
						stack.addFirst(str.charAt(i));
			}

		}

		if(stack.isEmpty())
			System.out.println("Empty String");
		else
		{
			while(!stack.isEmpty()){
				System.out.print(stack.removeLast());
			}
		}

	}
	
}

//abba a,b,b,d -> ba

//