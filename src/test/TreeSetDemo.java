package test;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String args[]){
		TreeSet<String> all=new TreeSet();
		all.add("a");
		all.add("b");
		all.add("d");
		all.add("c");
		all.add("b");
		all.add("ab");
		System.out.println(all);
	}

}
