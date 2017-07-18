import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String richieRich(String s, int n, int k){
    	int count = 0;
    	boolean check[] = new boolean[n];
    	char s_chars[] = new char[n];
    	s_chars = s.toCharArray();

    	if(k==0 && !checkPalindrome(s,n))
    		return "-1";

    	for(int start1 = 0,start2 = n-1;start1<start2;start1++,start2--){
    		if(s_chars[start1] != s_chars[start2]){
    			if(s_chars[start1]>s_chars[start2]){
    				s_chars[start2] = s_chars[start1];
    				check[start2] = true;
    				k--;
    			}
    			else{
    				s_chars[start1] = s_chars[start2];
    				check[start1] = true;
    				k--;
    			}
    		}
    		if(k<=0)
    			break;

    	}

    	String res = new String(s_chars);
    	if(k<=0 && !checkPalindrome(res,n))
    		return "-1";

    	if(checkPalindrome(res,n) && k<=0)
    		return res;

    	for(int start1 = 0,start2 = n-1;start1<start2;start1++,start2--){
    		if(s_chars[start1]<'9'){
    			if(!check[start1]  && !check[start2] && k>=2) 
		   		{
				   k-=2;
				   s_chars[start1] = s_chars[start2] = '9';
			   }
			   if((check[start1] || check[start2]) && k>=1)
			   {
				   k-=1;
				   s_chars[start1] = s_chars[start2] = '9';
			   }
    		}
    		if(k<=0)
    			break;
    	}

    	res = new String(s_chars);
    	if(!checkPalindrome(res,n) && k<=0)
    		return "-1";

    	if(checkPalindrome(res,n) && k<=0)
    		return res;


    	 if(n%2!=0){
    	 	 if(s_chars[n/2] !='9' && k>=0){
    	 	 	   s_chars[n/2] = '9';
    	 	 	   k--;
    	 	 }
    	 }

    	res = new String(s_chars);
    	if(!checkPalindrome(res,n) && k<=0)
    		return "-1";

    	
    	return res;
        
    }

    static int countInequalities(String s,int n){
    	int count = 0;
    	
    	for(int i=0;i<n/2;i++){
    		if(s.charAt(i)!=s.charAt(n-i-1))
    		{
    			count = count +1;
    			
    		}
    	}
    	return count;

    }

    static boolean checkPalindrome(String s,int n){
    	
    	boolean flag = true;
    	for(int i=0;i<n/2;i++){
    		if(s.charAt(i)!=s.charAt(n-i-1))
    		{
    			flag = false;
    			break;
    		}
    	}
    	if(flag)
    		return true;
    	else
    		return false;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        String result = richieRich(s, n, k);
        System.out.println(result);
    }
}

/*

TC-02: Given 7 1 1111111 => Expected result: 1119111
TC-03: Given 7 4 1111111 => Expected result: 9911199 with 4 replacements (one replacement operation left which cannot be used)
TC-04: Given 7 4 1191111 => Expected result: 9199919 with 4 replacements (one replacement operation left which cannot be used)
TC-05: Given 3 1 118 => Expected result: 818

*/
