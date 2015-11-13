package ch8of6;

public class ThreadbyImplement implements Runnable{
	public static Matrix date;
	public int i,j;
	public ThreadbyImplement(int i,int j){
		this.i=i;
		this.j=j;
	}
	public void run(){
		for(int t=this.i;t<=this.j;t++)
			date.getnewLine(t);
	}
}
