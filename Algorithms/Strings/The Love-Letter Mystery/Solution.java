import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int theLoveLetterMystery(String s){
        int max = 0;
        int min = 0;
        int ans = 0;
        for(int i=0, j=s.length()-1;i<s.length() && j>0 && i<=j; i++,j--){
            max = Math.max((int)(s.charAt(i)),(int)(s.charAt(j)));
            min = Math.min((int)(s.charAt(i)),(int)(s.charAt(j)));
            ans = ans + (max - min);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}
