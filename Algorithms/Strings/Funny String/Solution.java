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
            String result = funnyString(s);
            System.out.println(result);
        }
    }
    static String funnyString(String s){
        boolean flag = true;
        for(int i=1, j=s.length()-1;i<s.length() && j>0;i++,j--){

            //System.out.println("diff 1 "+Math.abs((int)(s.charAt(i))-(int)(s.charAt(i-1))));
            //System.out.println("diff 2 "+ Math.abs((int)(s.charAt(j))-(int)(s.charAt(j-1))));
                if(Math.abs((int)(s.charAt(i))-(int)(s.charAt(i-1))) != Math.abs((int)(s.charAt(j))-(int)(s.charAt(j-1)))){
                    flag = false;
                    break;
                }
            }
            if(flag)
                return ("Funny");
            else
                return("Not Funny");
        }
}