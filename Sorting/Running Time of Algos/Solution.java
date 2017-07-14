import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
       /*Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }*/
       int ar[] = {2, 1,3, 1, 2};
        insertionSort(ar);   
    }

    public static void insertionSort(int arr[]){
    	int i,j,key,shifts;
    	shifts = 0;
    	for (i=1;i<arr.length;i++){
    		key = arr[i];
    		for(j=i-1;j>=0;j--){
    			if(key<arr[j]){
    				arr[j+1]=arr[j];
    				shifts++;
    			}
    			else
    				break;
    		}
    		arr[j+1]=key;
    	}
    	System.out.println(shifts);
    }
}

   
     
