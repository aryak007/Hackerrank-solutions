import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int gemstones(String[] arr){

        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int count = 0;

        for(int i =0;i<arr.length;i++){
            HashSet<Character> set = new HashSet<Character>();
            for(int j = 0;j<arr[i].length();j++){
                set.add(arr[i].charAt(j));
            }
            for(char ch:set){
                if(map.containsKey(ch))
                    map.put(ch,map.get(ch)+1);
                else
                    map.put(ch,1);
            }
        }

        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if((int)pair.getValue()==arr.length)
                count++;
            it.remove(); 
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
