package test;
public class CountingThread extends Thread{
	public void run(){
		System.out.println();
		System.out.println("���߳�"+this+"��ʼ");
		for(int i=0;i<8;i++){
			System.out.print(this.getName()+".i="+(i+1)+"/t");
		}
		System.out.println();
		System.out.println("���߳�"+this+"����");
		}
}