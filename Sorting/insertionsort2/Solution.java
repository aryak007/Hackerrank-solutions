import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSortPart2(int[] arr)
    { 
        int i,j,key;     
        for(i=1;i<arr.length;i++){
          key = arr[i];
            for(j=i-1;j>=0;j--){
                if(key<arr[j])
                  arr[j+1]=arr[j];
                else{
                  break;
                }
            }
            arr[j+1] = key;
            printArray(arr);
        } 
    }  
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
        insertionSortPart2(ar);   
       /*int[] ar = {1, 4, 3, 5, 6, 2};
       insertionSortPart2(ar); */   
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
