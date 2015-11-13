package idea;

public class Recursive {
	private int n;
	private int s=0;
	static int wl,wb;
	int sum(){
		Recursive re=new Recursive();
		wb=this.n;
		int a=this.n;
		s+=n;
		n=a-1;
		wl=re.n;
     	/*if(re.n>=0){
			re.sum();
		}*/
		return s;
	}
	public static void main(String arg[]){
		Recursive r=new Recursive();
		r.n=2;
		r.sum();
		System.out.println(r.n+" "+wl+" "+wb);
	}
}
