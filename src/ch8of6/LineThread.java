package ch8of6;

public class LineThread extends Thread{
	public static Matrix date;
	public int i,j;
	public LineThread(int i,int j){
		this.i=i;
		this.j=j;
	}
	public void run(){
		for(int t=this.i;t<=this.j;t++)
			date.getnewLine(t);
		
	}
}
