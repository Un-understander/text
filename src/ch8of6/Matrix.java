package ch8of6;

public class Matrix {
	protected int FristMatrix[][] =new int[100][100],SecendMatrix[][]=new int[100][100];
	protected int LastMatrix[][]=new int[100][100];
	public Matrix(){
		for(int i=0;i<100;i++)
			for(int j=0;j<100;j++){
				this.FristMatrix[i][j]=j;
				this.SecendMatrix[i][j]=i;
			}
	}
	
	public void getnewLine(int line){
		int newline=0;
		for(int i=0;i<100;i++){
			newline=0;
			for(int j=0;j<100;j++)
				newline+=this.FristMatrix[i][j]*this.SecendMatrix[j][i];
			this.LastMatrix[line][i]=newline;
		}
	}
	public void showMatirx(int newMatrix[][]){	
		for(int i=0;i<100;i++){
			System.out.print("\n");
			for(int j=0;j<100;j++)
				System.out.print(newMatrix[i][j]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		long starttime=System.nanoTime();
		Matrix test=new Matrix();
		LineThread.date=test;
		ThreadbyImplement.date=test;
		int num=20;
		for(int i=0;i<100;i++){
			if((i+1)%(100/num)==0){
				new Thread(new ThreadbyImplement(i-(100/num)+1,i)).start();
			//new LineThread(i-(100/num)+1,i).start();
			}
			//test.getnewLine(i);
			
			
		}
		
		test.showMatirx(test.LastMatrix);
		System.out.println(Thread.activeCount());
		System.out.println(System.nanoTime()-starttime);
		
	}
}
