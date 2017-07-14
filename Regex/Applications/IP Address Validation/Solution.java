import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution{
		public static void main(String args[])throws Exception{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int t = Integer.parseInt(br.readLine());
			String patternIpv4="^(25[0-5]|2[0-4][0-9]|[01]{0,1}[0-9][0-9]{0,1})(\\.(25[0-5]|2[0-4][0-9]|[01]{0,1}[0-9][0-9]{0,1})){3}$";
			String patternIpv6="^[0-9a-f][0-9a-f]*[0-9a-f]*[0-9a-f]*(:[0-9a-f][0-9a-f]*[0-9a-f]*[0-9a-f]*){7}$";
			while(t-->0)
			{
				String line = br.readLine();
				Pattern r1 = Pattern.compile(patternIpv4);
				Matcher m1 = r1.matcher(line);
				Pattern r2 = Pattern.compile(patternIpv6);
				Matcher m2 = r2.matcher(line);
				if(m1.matches()){
					System.out.println("IPv4");

				}

				else if(m2.matches()){
					System.out.println("IPv6");
					
				}
				else
				{
					System.out.println("Neither");
				}
			}
	}
}
	