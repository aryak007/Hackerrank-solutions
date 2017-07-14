import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution{
		public static void main(String args[])throws Exception{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int t = Integer.parseInt(br.readLine());
            String pattern="^[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}";
			Pattern r = Pattern.compile(pattern);
			while(t-->0)
			{
				String line = br.readLine();
				Matcher m = r.matcher(line);
				
				if(m.matches()){
					System.out.println("VALID");

				}

				else
				{
					System.out.println("INVALID");
				}
			}
	}
}
	