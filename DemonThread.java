class Threads extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("User thread1:::::" + i);
        }
        System.out.print("my custom thread:::" + Thread.currentThread().getName());
    }
}

public class DemonThread {
    public static void main(String[] args) {
        Threads myDemon = new Threads();
        myDemon.start();
    }
}