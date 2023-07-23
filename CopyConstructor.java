class CopyConstructor {
    public static void main(String[] args) {
        A obj = new A();
        A refs = new A(obj);
    }
}

class A {
    int a, b;

    A() {
        a = 22;
        b = 62;

        System.out.println(a + " " + b);

    }

    A(A ref) {
        a = ref.a;
        b = ref.b;

        System.out.println(a + " " + b);
    }
}