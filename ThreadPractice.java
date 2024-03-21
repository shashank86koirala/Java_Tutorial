public class ThreadPractice {
    public static void main(String[] args) {
        
       
        Thread firstThread=new Thread(new FirstThread());
        Thread secondThread=new Thread(new SecondThread());
      

   firstThread.setPriority(6);
        firstThread.start();
        secondThread.start();
    }
}

class FirstThread implements Runnable
{
  public void run(){
    for(int i=0; i<=10; i++)
    try {
        Thread.sleep(1000);
        System.out.println("First Thread");
    } catch (InterruptedException e) {
        // TODO: handle exception
    }

  

  }
}


class SecondThread implements Runnable
{
    public void run(){
        for(int i=0; i<=10; i++)
        System.out.println("Second Thread"+i);
    
      }
}
