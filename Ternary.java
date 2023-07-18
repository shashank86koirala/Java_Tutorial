class Ternary {
    public static void main(String[] nm) {
        int a = 57, m = 35, n = 56, max;
        // max = (a>m) ? a m
        max = (a > m) ? (a > n ? a : n) : (m > n ? m : n);
        System.out.print(max);

    }
}