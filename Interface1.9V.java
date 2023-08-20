interface A {

    public static void call() {
        add(20, 30);
    }

    private static void add(int x, int y) {
        System.out.print("Sum of Numbers: " + (x + y));
    }
}

class B implements A {
    public void sub(int x, int y) {
        System.out.println("Sub of Numbers: " + (x - y));
    }
}

class Test {
    public static void main(String[] args) {
        B ref = new B();
        ref.call();
        ref.sub(30, 20);

    }
}