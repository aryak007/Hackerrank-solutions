import java.io.*;
import java.util.*;

public class Solution{

	public void printRotatedArray(int arr[],int ctr){
		
    int newArr[] = new int[arr.length];

		for(int i=0;i<arr.length;i++)
    {
			 int newPos =  newIndex(i,ctr,arr.length);
       newArr[newPos] = arr[i];
		}

    for(int i = 0;i<newArr.length;i++){
        System.out.print(newArr[i]+" ");
    }
	}

	public int newIndex(int pos,int ctr,int len){
		  if(pos-ctr<0)
        return len+(pos-ctr);
      else 
          return (pos - ctr);
  }




	 public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int ctr = in.nextInt();
       int[] ar = new int[s];
       Solution sol = new Solution();
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
        Solution sol = new Solution();
       //int[] ar = {1, 2, 3, 4, 5};
       sol.printRotatedArray(ar,ctr);                       
    }    
}

/*5 3
1 2 3 4 5
2 3 4 5 1
3 4 5 1 2
*/