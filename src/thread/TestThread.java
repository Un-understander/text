package thread;

public class TestThread extends Thread{
	public void run(){
		System.out.print("\n���߳�"+this+"��ʼ");
		for(int i=0;i<10;i++){
			if(i%1==0)
			System.out.print(this.getName()+".i="+(i+1)+"\t");
		}
		System.out.print("\n���߳�"+this+"����\n");
	}
	
}
