import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution{
		public static void main(String args[])throws Exception{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int t = Integer.parseInt(br.readLine());
            String pattern="^([0-9]+)( |-)([0-9]+)( |-)([0-9]+)";
			Pattern r = Pattern.compile(pattern);
			while(t-->0)
			{
				String line = br.readLine();
				Matcher m = r.matcher(line);
				
				if(m.find()){
					System.out.print("CountryCode="+m.group(1)+",");
					System.out.print("LocalAreaCode="+m.group(3)+",");
					System.out.print("Number="+m.group(5));
					System.out.println();
				}
			}
	}
}
	