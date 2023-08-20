// if class is final it cannot inherit
class Test {
    void number() {
        System.out.println("9815393066");
    }

    final void atm() {
        System.out.println("455");
    }
}

class A extends Test {
    void number() {
        System.out.println("9815393066");
    }

    // final method is up so cannot be excess final method
    // void atm() {

    // }
}

class FinalVariable {
    static final int A = 10;

    public static void main(String[] args) {
        System.out.println(A);
        A ref = new A();
        ref.number();
        ref.atm();

    }

}