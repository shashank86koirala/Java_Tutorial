class PassByValue {
    public static void main(String[] args) {
        int a = 55;
        System.out.println("before value is::" + a);
        number(a);
        System.out.println("after value is::" + a);
    }

    public static void number(int b) {
        System.out.println("inside the method::" + b);
        b = 100;
        System.out.println("inside the method::" + b);
    }

}