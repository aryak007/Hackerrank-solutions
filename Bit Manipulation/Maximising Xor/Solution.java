import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int max_val = -1;
        int res = -1;
        for(int i = l;i<=r;i++){
            for(int j = i;j<=r;j++){
               res = i ^ j;
               if(max_val<res)
                   max_val = res;
            }
        }
        System.out.println(max_val);
    }
}