class Apple {
    void add(int... a) // var-args method
    {
        int sum = 0;
        for (int x : a) // for each loop
            sum = sum + x;
        System.out.println("sum of numbers" + sum);
    }
}

class Demo {
    public static void main(String[] args) {
        Apple r = new Apple();
        r.add();
        r.add(10);
        r.add(10, 20);
        r.add(10, 20, 30);
        r.add(10, 20, 30, 40, 50);
    }
}