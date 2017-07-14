import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
           checkHackerString(s);

        }
    }

    static void checkHackerString(String s){
      
      if(s.matches(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*")){
            System.out.print("YES" + "\n");
        } else {
            System.out.print("NO" + "\n");
        }
       /* String pattern = ".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(s);
      if (m.matches()) {
         System.out.println("YES");
      }else {
         System.out.println("NO");
      }*/
    }
}
