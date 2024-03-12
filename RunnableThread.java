/**
 * RunnableThread
 */
 class Main implements Runnable {

   public void run(){
        System.out.println("hello"+Thread.currentThread().getName());

    }

    
}

/**
 *  main
 */
 class  RunnableThread {

    public static void main(String[] args) {
      // RunnableThread myObj=new RunnableThread();
       Thread thread1=new Thread(new Main());
      
       thread1.start();
       
    }

    
}