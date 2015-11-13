package idea;

import java.util.Scanner;

public class Memory {

	public static int i=0;
	public static void b(){
		i++;
		b();
	}
	public static void main(String args[]){
		Scanner read=new Scanner(System.in);
		int a=read.nextInt();
	/*	try{
			b();
		}catch(Throwable e){
			System.out.println(i);
			e.printStackTrace();  
		}*/
	System.out.println(a);
	}
}
