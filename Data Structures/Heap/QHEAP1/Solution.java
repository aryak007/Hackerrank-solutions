import java.io.*;
public class Solution
{
    public void sort(int arr[])
    {
        int n = arr.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;        
            heapify(arr, i, 0);
        }
    }

    public int returnDeleteElementPosition(int arr[],int elem)
    {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        while(low<=high)
        {
            mid = low+(high-low)/2;
            if(elem == arr[mid])
                return mid;
            else if(elem>arr[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int smallest = i; 
        int l = 2*i + 1;  
        int r = 2*i + 2;  
 
        // If left child is smaller than root
        if (l < n && arr[l] < arr[smallest])
            smallest = l;
 
        // If right child is smaller than smallest so far
        if (r < n && arr[r] < arr[smallest])
            smallest = r;
 
        // If smallest is not root
        if (smallest != i)
        {
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, smallest);
        }
    }

      static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
 
 
 
    // Driver program
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int arr[] = new int[t];
        Solution ob = new Solution();
        int i = 0;
        while(t-- >0){
            String input = br.readLine();
            input = input+" ";

            int query = Integer.parseInt(input.split(" ")[0]);
            if(query == 1){
                int v = Integer.parseInt(input.split(" ")[1]);
                arr[i] = v;
                ob.sort(arr);
                printArray(arr);
                i++;
                continue;
            }
            if(query ==2){
                int v = Integer.parseInt(input.split(" ")[1]);
                int del = ob.returnDeleteElementPosition(arr,v);
                //System.out.println(del);
                arr[del] = 0;
                ob.sort(arr);
                i--;
                continue;
            }
            if(query==3){
                System.out.println(arr[i-1]);
                //printArray(arr);
                continue;
            }
        }
    }
}