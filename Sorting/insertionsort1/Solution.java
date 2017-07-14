import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    

    public static void insertIntoSorted(int[] arr) {
        int elmToInsert = arr[arr.length-1];
        int i;
        for(i=arr.length-2;i>=0;i--){
            if (elmToInsert<arr[i]){
                arr[i+1]=arr[i];
                printArray(arr);
            }
            else
                break;
            
        }
        arr[i+1]=elmToInsert;
        printArray(arr);
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        //int[] ar = {2,4,6,8,3};
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 
