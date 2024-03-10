import java.lang.*;

class A implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("this is thread in run method");
            // Thread.sleep(1000);

        }
    }
}

class ThreadTime {
    public static void main(String[] args) {
        A myObj = new A();
        myObj.start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("this is thread in run method11");

        }
    }
}