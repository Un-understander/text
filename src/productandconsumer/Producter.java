package productandconsumer;

class Producter	implements Runnable {
	protected Buffer date;
	protected Producter(Buffer date){
		this.date=date;
	}
	public void run(){
		int i=50;
		while(i-->0){
			try {
				this.date.product();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
