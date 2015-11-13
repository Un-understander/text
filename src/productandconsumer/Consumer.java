package productandconsumer;

class Consumer implements Runnable{
	protected Buffer date;
	protected Consumer(Buffer date){
		this.date=date;
	}
	
	public void run(){
		int i=50;
		while(i-->0){
			try {
				this.date.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
