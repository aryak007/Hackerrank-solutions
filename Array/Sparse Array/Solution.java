import java.io.*;
import java.util.*;

public class Solution{

	public void sparseArray(String arr[],String queries[]){
      int ctr = 0;
      for(int i=0;i<queries.length;i++){
        ctr = 0;
          for(int j=0;j<arr.length;j++){
              if(queries[i].equals(arr[j]))
                ctr++;
          }
          System.out.println(ctr);
      }      
	}

	 public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int N = in.nextInt();
       String[] arr = new String[N];
       for(int i=0;i<N;i++){
            arr[i]=in.next(); 
       }
       int Q = in.nextInt();
       String queries[] = new String[Q];
       for(int i=0;i<Q;i++){
            queries[i]=in.next(); 
       }       

        Solution sol = new Solution();
       //int[] ar = {1, 2, 3, 4, 5};
       sol.sparseArray(arr,queries);                       
    }    
}
