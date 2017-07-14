import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution{
		public static void main(String args[])throws Exception{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int t = Integer.parseInt(br.readLine());
			String pattern="^((\\([+-]*(90|90\\.[0]+|[1-8][0-9]{0,1})\\.[0-9]+)|(\\([+-]*(90|[1-8][0-9]{0,1})))(, )(([+-]*([1-9]|180|180\\.[0]+|1[0-9]|1[0-7][0-9]|[2-9][0-9])\\))|([+-]*([1-9]|1[0-9]|1[0-7][0-9]|[2-9][0-9])\\.[0-9]+\\)))";
			Pattern r = Pattern.compile(pattern);
			while(t-->0)
			{
				String line = br.readLine();
				Matcher m = r.matcher(line);
				
				if(m.matches()){
					System.out.println("Valid");

				}

				else
				{
					System.out.println("Invalid");
				}
			}
	}
}
	