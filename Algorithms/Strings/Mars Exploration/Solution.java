import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int count = 0;
        for(int i=0;i<S.length();i++){
            if(i%3==0 && (S.charAt(i)!='S'))
                   count++;
            if(i%3==1 && (S.charAt(i)!='O'))
                count++;
            if(i%3==2 && (S.charAt(i)!='S'))
                count++;
                  
        }
        System.out.println(count);
    }
}
