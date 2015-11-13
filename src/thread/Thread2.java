package thread;

public class Thread2 {  
    public void m4t1() {  
         synchronized(this) {  
              int i = 1;  
              while( i-- > 0) {  
                   System.out.println(Thread.currentThread().getName() + " : " + i);  

                   try {
       				Thread.sleep(100);
       			} catch (InterruptedException e) {
       				// TODO Auto-generated catch block
       				e.printStackTrace();
       			}
              }  
         }  
    }  
    public synchronized void m4t2() {  
         int i = 1;  
         while( i-- > 0) {  
              System.out.println(Thread.currentThread().getName() + " : " + i);  

              try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }
    }  
    public static void main(String[] args) {  
         final Thread2 myt2 = new Thread2();  
         Thread t1 = new Thread(  new Runnable() {  public void run() {  int j=5;while(j-->0) myt2.m4t1();  }  }, "t1"  );  
         Thread t2 = new Thread(  new Runnable() {  public void run() { int j=5;while(j-->0) myt2.m4t2();   }  }, "t2"  );  
         t1.start();  
         t2.start();  
    } 
}
