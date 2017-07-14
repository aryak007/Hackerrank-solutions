import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String twoStrings(String s1, String s2){
        int count[] = new int[26];
        boolean flag = false;
        for(int i = 0;i<s1.length();i++){
            if(count[(int)(s1.charAt(i))-(int)('a')]==0)
                count[(int)(s1.charAt(i))-(int)('a')]++;
        }

        for(int i=0;i<s2.length();i++){
            if(count[(int)(s2.charAt(i))-(int)('a')]>0){
                flag = true;
                break;
            }
        }
        if(flag)
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
