//https://www.hackerrank.com/challenges/string-reduction
//Algorithm used - http://stackoverflow.com/a/8715230/2309841
import java.io.*;

class Solution{
  public static void main(String args[]) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int T = Integer.parseInt(br.readLine());
      while((T--)>0){
        String input = br.readLine();
        System.out.println(reduceString(input));
      }
  }
    static int reduceString(String str){
        int count[] = new int[3];
        int zeroes = 0;
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0;i<str.length();i++){
          count[str.charAt(i)-'a']++;
        }

        for(int i=0;i<3;i++){
          if(count[i]==0)
              zeroes++;
          if(count[i]%2==0)
              evenCount++;
          if(count[i]%2!=0)
              oddCount++;
        }
        if(zeroes==2)
          return str.length();
        
        else if(evenCount==3)
            return 2;
        else if(oddCount==3)
            return 2;
        else
            return 1;
        
    }
}
