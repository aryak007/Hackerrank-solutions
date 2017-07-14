import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        //Map<Character,Integer> map = checkUniformString(s);
        //Map<Integer,Character> newMap = new HashMap<Integer,Character>();
        /*Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
        	Map.Entry pair = (Map.Entry)it.next();
        	System.out.println(pair.getKey() + " = " + pair.getValue());
        	newMap.put((int)(pair.getValue()),(char)(pair.getKey()));
        	it.remove(); // avoids a ConcurrentModificationException */
        Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();

        HashSet<Integer> set = createSet(s);
        for(Integer i:set){
        	map.put(i,true);
        	//System.out.println(i);
        }


        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            if(map.get(x)!=null)
            	System.out.println("Yes");
            else
            	System.out.println("No");
        }
    }

    static HashSet<Integer> createSet(String str){
    	HashSet<Integer> set = new HashSet<Integer>();
    	char newChar = '\0';
    	char prevChar = '\0';
    	int count_so_far = 0;
    	for(int i=0;i<str.length();i++)
    	{
	    		newChar = str.charAt(i);

	    		if(newChar == prevChar)
	    		{
	    			count_so_far = count_so_far + ((int)(newChar)-(int)('a')+1);
	    			set.add(count_so_far);
	 
	    		}
	    		else
	    		{
	    			count_so_far = ((int)(newChar)-(int)('a')+1);
	    			set.add(count_so_far);
	    		}
	    		
	    		prevChar = newChar;
    	}
    	set.add(count_so_far);
    	return set;
    }

    

    /*static Map<Character,Integer> checkUniformString(String str)
    {
    	Map<Character,Integer> map = new HashMap<Character,Integer>();
    	char newChar='a';
    	char prevChar='a';
    	int sum = 0;
    	for(int i=0;i<str.length();i++){
    		newChar = str.charAt(i);
    		if(!map.containsKey(str.charAt(i)))
    		{
    			map.put(str.charAt(i),(int)(newChar)-(int)('a')+1);
    			prevChar = newChar;
    			sum = (int)(newChar)-(int)('a')+1;
    		}
    		else
			{
    			if(newChar==prevChar)
    			{

    				sum = sum + ((int)(newChar)-(int)('a')+1);
    				if(sum>map.get(newChar))
    					map.put(newChar,map.get(newChar)+((int)(newChar)-(int)('a'))+1);
    				prevChar = newChar;

    			}
    			else{
    				sum = (int)(newChar)-(int)('a')+1;

    			}
    		}
    	}

    	return map;	
    }*/
}

//abccddde