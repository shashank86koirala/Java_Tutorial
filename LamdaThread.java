public class LamdaThread {
    public static void main(String[] args) {
        System.out.println("checkin the start");
        Thread usThread1=new Thread(()->{
            try{
                for(int a=0; a<=10; a++){
                    Thread.sleep(100);
                    System.out.println("thread:::first"+a);
                }
            }catch(InterruptedException e){
e.printStackTrace();
            }
         
        });
        Thread demoThread=new Thread(()->{
            try{
                for(int a=0; a<=10; a++){
                    Thread.sleep(100); 
                    System.out.println("thread:::second"+a);
                }
            }
            catch(InterruptedException e){
e.printStackTrace();
            }
           
        });
        System.out.println("checkin the end");
        usThread1.start();
        demoThread.setDaemon(true);
        demoThread.start();
    }
    
}
