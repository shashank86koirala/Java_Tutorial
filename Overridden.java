class A {
    void show() {
        System.out.println("show me something");
    }

    A(int a) {
        System.out.println("this is me" + a);
    }
}

class B extends A {
    // @override
    B() {
        super(100);
        System.out.println("im herer");
    }

    void show() {
        // super(10);
        super.show();
        System.out.println("im coder");
    }
}

class Overridden {

    public static void main(String[] args) {
        A ref = new B();
        ref.show();
    }
}