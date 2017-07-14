import java.util.*;
public class Solution {
       
      static void partition(int[] ar) {
          int pos = 0;
          int partition = ar[pos];
          int temp;
         
          printArray(ar);                
    }  

    static int quickSort(int ar[],int start,int end){
         for(int i = start;i<end;i++){
            if(ar[i]<partition){
                temp =  ar[i];
                ar[i] = ar[pos];
                ar[pos] = temp;  
                //pos = i;
                //System.out.print(pos + "---");
            }
            printArray(ar);
          }   
    } 
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }

   /*
        4 5 3 7 2
        4 5 3 7 2 
        3 5 4 7 2 
        3 5 4 7 2 
        3 5 2 7 4 
        3 5 2 7 4 
   */
