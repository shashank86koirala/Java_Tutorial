class PassByRefrence {
    public static void main(String[] args) {
        PassByRefrence ref = new PassByRefrence();

        int a[] = { 123, 124 };

        System.out.println("before array vlaue:::" + a[0]);
        // data(a);
        ref.data(a);
        System.out.println("after array vlaue:::" + a[0]);

    }

    public void data(int as[]) {
        System.out.println("inside the method value:::" + as[0]);
        as[0] = 10;
        System.out.println("inside the method value:::" + as[0]);
    }

}