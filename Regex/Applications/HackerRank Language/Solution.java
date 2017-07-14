import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution{
		public static void main(String args[])throws Exception{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int t = Integer.parseInt(br.readLine());
			while(t-->0){
				String line = br.readLine();
				String pattern = "^[\\d]+\\s(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)";
				//String pattern = "^.(?:C|CPP|JAVA|PYTHON)";
				Pattern r = Pattern.compile(pattern);
				Matcher m = r.matcher(line);
				boolean flag = false;
				int i = 0;
				//System.out.println(m.find());
				if(m.find()){
					System.out.println("VALID");
				}
				else{
					System.out.println("INVALID");
				}
		}

	}
}
	