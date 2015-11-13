package test;

public class Hello {
	private String a;
	void show(){
		System.out.println(a);
	}
	public static void main(String arg[]){
		Hello hello=new Hello();
		hello.a="Hello world!";
		hello.show();
	}
}
