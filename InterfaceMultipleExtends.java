interface As {
    void out();

}

interface B {
    void in();
}

class Both implements As, B {
    public static void main(String[] args) {
        Both sc = new Both();
        sc.out();
        sc.in();
    }

    public void out() {
        System.out.println("Give your input");
    }

    public void in() {
        System.out.println("its shashank koirala");

    }

}