class Alpha implements Runnable {
    public void run() {

        for (int a = 1; a <= 5; a++) {

            System.out.println("this run method");

        }
    }
}

class ThreadInterface {
    public static void main(String[] args) {
        Alpha ref = new Alpha();
        Thread refrence = new Thread(ref);
        refrence.start();

        for (int a = 1; a <= 5; a++) {

            System.out.println("run method");

        }
    }
}