class NestedFor {
    public static void main(String[] argys) {
        int a, b;
        for (a = 1; a <= 10; a++) {
            for (b = 1; b <= 10; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}