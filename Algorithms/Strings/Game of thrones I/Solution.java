import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String gameOfThrones(String s){
        int count[] = new int[26];
        boolean flag = true;
        boolean isUniqueCharPresent = false;
        for(int i=0;i<s.length();i++){
        	count[(int)(s.charAt(i))-(int)('a')]++;
        }

        if(s.length()%2==0){
            for(int i = 0;i<26;i++){
                if(count[i]%2!=0){
                    return "NO";
                }
            }
        }
        else{
            for(int i = 0;i<26;i++){
                if(count[i]==1 && isUniqueCharPresent)
                    return "NO";

                if(count[i]==1 && !isUniqueCharPresent)

                    isUniqueCharPresent = true;

            }
        }

        return "YES";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
