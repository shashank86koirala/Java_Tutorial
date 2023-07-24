class A {
    void show() {
        System.out.println("show me something");
    }
}

class B extends A {
    // @override
    void show() {
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