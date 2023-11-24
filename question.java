class Question {
    public static void main(String[] args) {
        int x = 9, y, z;
        y = x++;
        z = ++x;
        System.out.println("x value::" + x);
        System.out.println("y value::" + y);
        System.out.println("z value::" + z);
    }
}