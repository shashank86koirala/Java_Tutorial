class A {
  public  String show() {
        System.out.println("show me something");
        return "hello";
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

  public  String show() {
         //super(10);
        super.show();
        System.out.println("im coder");
        return "adsfa";
    }
}

class Overridden {

    public static void main(String[] args) {
        A ref = new B();
        ref.show();
    }
}