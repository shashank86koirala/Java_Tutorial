import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

     public static void main(String[] args) {
         try{
             ThreadPoolExecutor threadObj=new ThreadPoolExecutor(2, 4, 30, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5)
                     ,new CustomeThreadFactory(),new CustomeRejectHandler() );
                     threadObj.allowCoreThreadTimeOut(true);
             for(int i=0; i<10; i++)
             {

                     threadObj.submit(()->{
                         try{
                             Properties ne=new Properties();
                         Thread.sleep(5000);
                         }catch(InterruptedException e) {

                         }
                         System.out.println("This the task process by: "+Thread.currentThread().getName());
                     });
             }
             threadObj.shutdown();
         }catch (IllegalArgumentException es){

         }
         finally {

         }

     
        }
}

class CustomeThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r)
    {
        Thread myThread= new Thread(r);
        myThread.setPriority(Thread.NORM_PRIORITY);
        myThread.setDaemon(false);
     //   myThread.setName("firstThread");
        return myThread;
    }

}

/**
 *  CustomeRejectHandler implements RejectedEx
 */
 class  CustomeRejectHandler implements RejectedExecutionHandler {
   public void rejectedExecution(Runnable r, ThreadPoolExecutor executor){
        System.out.println("Task is rejected"+r.toString());
    }
    
}