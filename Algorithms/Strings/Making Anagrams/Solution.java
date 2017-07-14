import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int makingAnagrams(String s1, String s2){
        int counts1[] = new int[26];
        int counts2[] = new int[26];

        int deletionsRequired = 0;
        for(int i = 0;i<s1.length();i++){
            counts1[(int)(s1.charAt(i))-(int)('a')]++;
        }
        
        for(int i = 0;i<s2.length();i++){
            counts2[(int)(s2.charAt(i))-(int)('a')]++;
        }  

        for(int i = 0;i<26;i++){
            if(counts1[i]!=counts2[i]){
                deletionsRequired =deletionsRequired+ Math.abs(counts1[i]-counts2[i]);
            }
        }   
        return deletionsRequired;   
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
