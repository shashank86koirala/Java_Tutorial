class A extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("this is thread in run method");

        }
    }
}

class Thread {
    public static void main(String[] args) {
        A ref = new A();
        ref.run();

        System.out.println("this is shashank koirala");
    }
}