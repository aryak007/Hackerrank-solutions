import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String str = sc.next();
        int k = sc.nextInt();
        //StringBuffer sb = new StringBuffer(str);
        String newStr = "";
        for(int i = 0;i<len;i++)
        {
        	if(((int)(str.charAt(i))>=65 && (int)(str.charAt(i)) <=90)){

        		newStr = newStr + (char)(65+((((int)(str.charAt(i)))-65+k)%26));
        	}
        	else if (((int)(str.charAt(i))>=97 && (int)(str.charAt(i))<=122)){
        		newStr = newStr + (char)(97+((((int)(str.charAt(i)))-97+k)%26));
        	}
        	else
        		newStr = newStr + str.charAt(i);

        }
       System.out.println(newStr);
    }
}