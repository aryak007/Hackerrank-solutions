import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int stringConstruction(String s){
        int count[] = new int[26];
        int c = 0;
        for(int i=0;i<s.length();i++){
            if(count[(int)(s.charAt(i))-(int)('a')]==0)
                count[(int)(s.charAt(i))-(int)('a')]++;
        }

        for(int i=0;i<26;i++){
            if(count[i]>0)
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
    }
}
