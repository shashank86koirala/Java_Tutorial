class AnoQuestion {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 0;
        x = x++;
        y = ++x;
        z = x + y;
        System.out.println("value of z:::" + z);
    }
}