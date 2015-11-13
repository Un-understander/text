package test;

import java.util.StringTokenizer;

public class Tokenizer {
		public static void main(String args[]){
			String s="10 10 11 20/ / / 3              0";
			StringTokenizer tokenizer=new StringTokenizer(s," /");
				while(tokenizer.hasMoreTokens())
				System.out.println(tokenizer.nextToken());
		}

}
