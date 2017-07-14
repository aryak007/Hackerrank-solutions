import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isValid(String s){

    	int count[] = new int[26];
    	boolean exactlyOne = false;
    	int freq = 0;
    	int pos = 0;

    	Set<Integer> set = new HashSet<Integer>();
    	String result = "YES";
        for(int i=0;i<s.length();i++){
        	count[(int)(s.charAt(i))-(int)('a')]++;
        }

        
        for(int i=0;i<26;i++){
            if(count[i]>0){
                freq = count[i];
                pos = i;
                break;
            }
        }
        
        for(int i = pos;i<26;i++){

        	if(count[i]>0){

        		if(count[i]!=freq && Math.abs(count[i]-freq)!=1 && count[i]!=1){
                    //System.out.println("AAAA"+count[i]+" "+i+" "+freq);
        			result = "NO";
        			break;
        		}

	        	else if((Math.abs(count[i]-freq)==1 || count[i]==1) && exactlyOne){
                    //System.out.println("AAAA"+count[i]+" "+i+" "+freq+" 2nd");
	        		result = "NO";
	        		break;
	        	}


	        	else if((Math.abs(count[i]-freq)==1 || count[i]==1) && !exactlyOne){
                    //System.out.println("AAAA"+count[i]+" "+i+" "+freq+" 3nd");
	        		exactlyOne = true;
                    freq = count[i];
	        	}
                else{
                    freq = count[i];
                }
        	}
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
