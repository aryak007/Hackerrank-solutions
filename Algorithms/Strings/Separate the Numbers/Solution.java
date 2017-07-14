import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        long temp;
        long x=0;
 		boolean flag;
        StringBuilder strtemp = new StringBuilder();

        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            flag = false;
            for(int i =1;i<=(s.length())/2;i++){
            	temp = Long.parseLong(s.substring(0,i));
            	x = temp;
            	strtemp = new StringBuilder("");
            	strtemp.append(Long.toString(temp));
            	while(strtemp.length()<s.length())
            	{
            		strtemp.append(Long.toString(++temp));
            	}
            	//System.out.println("st "+strtemp);
            	if((strtemp.toString()).equals(s))
            	{
            		flag = true;
            		break;
            	}
            }
            if(flag)
            	System.out.println("YES "+x);
            else
            	System.out.println("NO");
        }
    }
}
