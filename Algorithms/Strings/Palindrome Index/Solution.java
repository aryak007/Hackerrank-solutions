import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int palindromeIndex(String s){
        // Complete this function
        int n = s.length();
        int pos = -1;
        if(checkIfPalin(s)){

            return pos;
        }
        for(int i = 0;i<n;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                if(i==0 && checkIfPalin(s.substring(1,n))){
                    pos = 0;
                }
                else
                    pos = n-1;
                if(checkIfPalin(s.substring(0,i)+s.substring(i+1,n))) {
                    pos = i;
                }
                else
                    pos = n-i-1;
                break;
  
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }

    static boolean checkIfPalin(String s){
        boolean flag = true;
        int n = s.length();

        for(int i = 0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1))
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
}