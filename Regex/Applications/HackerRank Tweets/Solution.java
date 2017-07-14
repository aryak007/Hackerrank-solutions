import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution{
		public static void main(String args[])throws Exception{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int t = Integer.parseInt(br.readLine());
			String str[] = new String[t];
			for(int i=0;i<t;i++){
				str[i] = br.readLine();
			}
			int count=0;
			for(int i=0;i<str.length;i++){

				String pattern = "^(.)*[Hh][Aa][Cc][Kk][Ee][Rr][Rr][Aa][Nn][Kk](.)*$";
				Pattern r = Pattern.compile(pattern);
				Matcher m = r.matcher(str[i]);
				//System.out.println(m.find());
				if(m.find()){
					count++;
				}
			}

			System.out.println(count);
				
				

	}
}
	