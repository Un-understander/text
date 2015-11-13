package test;
import java.io.*;
public class MyException extends Exception{
	void test(double x) throws MyException{
	if(x<0.0) throw new MyException();
	else System.out.println(Math.sqrt(x));
     }
	public static void main(String arg[]) throws IOException{
		MyException n=new MyException();
		try{
			System.out.print("求输入实数的平方根，请输入一个数：");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String s=br.readLine();
			n.test(Double.parseDouble(s));
		}catch(MyException e){
			System.out.println("输入错误！");
		}
	}
}
