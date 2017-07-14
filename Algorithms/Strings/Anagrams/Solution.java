import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static char[] s1;
    static char[] s2;

    static int anagram(String s){
        //str = s.toCharArray();
            int count = 0;
        int len = s.length();
        if(len%2==1)
            return -1;
        else
        {
            s1 = s.substring(0,len/2).toCharArray();
            s2 = s.substring(len/2,len).toCharArray();
            
            int counts1[] = new int[26];
            int counts2[] = new int[26];

            for(int i = 0;i<s1.length;i++){
                counts1[(int)(s1[i])-(int)('a')]++;
            }

            for(int i = 0;i<s2.length;i++){
                counts2[(int)(s2[i])-(int)('a')]++;
            }   

            for(int  i =0;i<26;i++){
                if(counts2[i]>counts1[i])
                    count = count + (counts2[i]-counts1[i]);
            }        

        }
        return count;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}
