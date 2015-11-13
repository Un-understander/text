package productandconsumer;

class Buffer {
	protected int buffer;
	protected int num;
	protected Buffer(int buffer){
		this.buffer=buffer;
		this.num=0;
	}
	protected  void product() throws InterruptedException{
		synchronized(this){if(this.buffer==0)
			wait();
			Thread.sleep(20);
		this.buffer-=1;
		this.num+=1;
		System.out.println("生产----现在的产品数量为："+this.num);
		notify();
		}
	}
	protected synchronized void consume() throws InterruptedException{
		if(this.num==0)
			wait();
		Thread.sleep(20);
		this.buffer+=1;
		this.num-=1;
		System.out.println("消费----现在的产品数量为："+this.num);
		notify();
	}
	protected void show(){
		System.out.println("----现在的产品数量为："+this.num);
	}
	public static void main(String args[]){
		Buffer date=new Buffer(6);
		new Thread(new Producter(date)).start();
		new Thread(new Consumer(date)).start();
	}

}
