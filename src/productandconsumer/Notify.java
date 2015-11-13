package productandconsumer;

class Notify implements Runnable{
	protected Consumer consumer;
	protected Notify(Consumer consumer){
		this.consumer=consumer;
	}
	public void run(){
			while(true){
				try {
					wait();
					this.consumer.notify();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}
