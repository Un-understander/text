package test;

public class ThreadTest extends CountingThread {
	public static void main(String arg[]){
		System.out.println("���߳̿�ʼ");
		CountingThread Thread1=new CountingThread();
		Thread1.start();
		CountingThread Thread2=new CountingThread();
		Thread2.start();
		CountingThread Thread3=new CountingThread();
		Thread3.start();
		System.out.println("���߳̽���");
	}
}
