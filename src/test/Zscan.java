package test;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Zscan {
	private int SIZE;
	private int[][] Matrix;
	private void getSize(){
		Scanner readSize=new Scanner(System.in);
		this.SIZE=readSize.nextInt();
	}	
	private void getMatrix(){
		this.Matrix=new int[this.SIZE][this.SIZE];
		Scanner readMatrix=new Scanner(System.in);
		String intStr;
		for(int i=0;i<this.SIZE;i++){
			intStr=readMatrix.nextLine();
			StringTokenizer getInt=new StringTokenizer(intStr," ");
			for(int n=0;getInt.hasMoreTokens();n++){
				Matrix[i][n]=Integer.parseInt(getInt.nextToken());
			}
		}
	}
	private void Scan(){	
		boolean t=false;	
		for(int i=0;i<=2*this.SIZE-2;i++){
			if(i<this.SIZE){
				for(int n=0;n<=i;n++){
				
					if(t)
						System.out.print(this.Matrix[n][i-n]+" ");
					else
						System.out.print(this.Matrix[i-n][n]+" ");
			}
		}
			else{
				for(int n=this.SIZE-1;i-n<this.SIZE;n--){
					if(!t)
						System.out.print(this.Matrix[n][i-n]+" ");
					else
						System.out.print(this.Matrix[i-n][n]+" ");
				}
			}
			t=!t;
		}
	}	
	public static void main(String args[]){
		Zscan test=new Zscan();
		test.getSize();
		test.getMatrix();
		test.Scan();
	}
}
