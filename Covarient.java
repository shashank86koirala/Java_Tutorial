class A {
    A show1() {
        System.out.print("showing error guys");
        return new A();

    }
}

class B extends A {
    @Override
    B show1() {
        System.out.print("another error");
        return this;
    }
}

class Covarient {
    public static void main(String[] args) {
        B ref = new B();
        ref.show1();
    }
}