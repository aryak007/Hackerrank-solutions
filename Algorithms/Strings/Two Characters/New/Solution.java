import java.util.*;
import java.io.*;

class Solution{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
	    int len = sc.nextInt();
	    String input  = sc.next();
	   	List<Character> uniqueElems = new ArrayList<Character>();
		
		int arr[] = charectersPresent(input);
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>0)
				uniqueElems.add((char)((int)('a')+i));
		}
		/*for(char ch:uniqueElems){
			System.out.print(" "+ch);
		}*/
	    System.out.println(lengthOfLargestAltString(input,uniqueElems));

	}

	
//abaacdabd

	static int[] charectersPresent(String str){
		int arr[] = new int[26];
		for(int i=0;i<str.length();i++){
			arr[(int)str.charAt(i)-(int)('a')]++;
		}
		return arr;
	}

	static int lengthOfLargestAltString(String str, List<Character> uniqueElems){
		int largestLengthSoFar = 0;
		if(str.length()<2)
			return 0;

		if(str.length()==2)
			return str.length();
		//for(int i=0;i<uniqueElems.size();i++){
			//for(int j =0;j<uniqueElems.size();j++){

		for(char ch1:uniqueElems){
			for(char ch2:uniqueElems){

				if(ch1==ch2)
					continue;
				//char ch1 = (char)((int)'a' + i);
                //char ch2 = (char)((int)'a' + j);
                int countLen = 0;
                boolean isFirstCharMatchOn = false;
               	//System.out.println("For pair "+ch1+", "+ch2);

				for(int k=0;k<str.length();k++){
					char ch = str.charAt(k);
					if(ch == ch2 && !isFirstCharMatchOn){
						//System.out.println("Matched with char2 "+ch +"with "+ch2);
						break;
					}

					if(ch == ch1 && isFirstCharMatchOn){
						//isFirstCharMatchOn = true;
						//System.out.println("Matched with char1 "+ch +"with "+ch1+" but first char repeat");
						break;
					}

					if(ch == ch1 && !isFirstCharMatchOn){
						isFirstCharMatchOn = true;
						//System.out.println("Matched with char1 "+ch +"with "+ch1);
					}


					if(isFirstCharMatchOn && ch==ch2){
						//System.out.println("Inside third if.Matched with char2 "+ch +"with "+ch2);
						countLen = countLen +2;
						isFirstCharMatchOn = false;
					}
					else{
							//System.out.println("Skipping "+ch);
							continue;
					}
				}
				if(isFirstCharMatchOn)
					countLen++;
				if(countLen>largestLengthSoFar)
					largestLengthSoFar = countLen;

				//System.out.print (countLen+" so far length");
			}
		}
		return largestLengthSoFar;
	}
}