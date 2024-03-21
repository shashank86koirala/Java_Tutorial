import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyRunnable implements Runnable{
    private Lock lock = new ReentrantLock();


   
    public synchronized  void run(){
       


        int count=0;
        for(int i=0; i<=12; i++){
            System.out.println("Thread: " + Thread.currentThread().getName() + ", i: " + i);
           
            count++;
        }

        System.out.println("value of the count"+count);
      
    }

 
}

public class SynchronizeThread {
    public static void main(String[] args) throws Exception {
     
       // Synchronized first=new Synchronized();
        Thread ref=new Thread(new MyRunnable());
        Thread ref1=new Thread(new MyRunnable());
        ref.start();
        ref1.start();

        ref.join();
        ref1.join();

      //  System.out.println("count:::::::::::::"+MyRunnable.count);
    }
  
}