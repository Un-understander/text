package productandconsumer;

class Notifyc implements Runnable{
	protected Producter producter;
	protected Notifyc(Producter producter){
		this.producter=producter;
	}
	public void run(){
		while(true){
		try {
			wait();
			this.producter.notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}
