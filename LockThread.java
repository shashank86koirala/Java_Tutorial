import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockThread {

    public static void main(String[] args) {

        FirstThread myObj=new FirstThread();
        Thread myThread=new Thread(myObj);
        Thread myThread1=new Thread(myObj);
        myThread.start();
        myThread1.start();
        

    }

    
}

class FirstThread implements Runnable{
    Lock myLock=new ReentrantLock();
    
    public void run(){
    int count=0;
       
        for(int i=0; i<15; i++){
            try{
                System.out.println(Thread.currentThread().getName()+"count i:::"+i);
               // myLock.lock();
                count++;
                
                Thread.sleep(1000);
            }catch(InterruptedException Er){
                System.err.println(Er);
            }
            finally{
               // myLock.unlock();
            }

            System.out.println("counting count:::::::::::::::::::"+count);
         }
        //  // Check if the lock is working
        //  if (myLock.tryLock()) {
        //     // Lock was acquired, meaning it wasn't locked by another thread
        //     System.out.println("Lock is working");
        //     myLock.unlock(); // Release the lock
        // } else {
        //     // Lock wasn't acquired, meaning it's working as expected
        //     System.out.println("Lock is working");
        // }
    }

}
