import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int smallest = arr[0];
        int largest = arr[0];
        BigInteger sum = new BigInteger("0");
        for(int i=0;i<5;i++){
        	if(smallest>arr[i])
        		smallest = arr[i];
        	if(largest<arr[i])
        		largest = arr[i];

        }
        for(int i =0;i<5;i++){
        	sum = sum.add(new BigInteger(Integer.toString(arr[i])));
        }
        System.out.println(sum.subtract(new BigInteger(Integer.toString(largest)))+" "+(sum.subtract(new BigInteger(Integer.toString(smallest)))));
    }
}
