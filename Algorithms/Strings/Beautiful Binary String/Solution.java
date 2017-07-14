import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minSteps(int n, String str){
    	int count = 0,i = 0;
        while(i<n-2){
        	if(str.charAt(i)=='0' && str.charAt(i+1)=='1' && str.charAt(i+2)=='0'){
        		count++;
        		i = i+3;
        	}
        	else
        		i++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}
