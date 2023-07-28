class PyramidFull {
    public static void main(String[] args) {
        int h, i, j, k, l, m, n, o;
        for (l = 1; l <= 5; l++) {
            for (m = 5; m > l; m--) {
                System.out.print(" ");
            }
            for (n = 1; n <= l; n++) {
                System.out.print("*");
            }
            for (o = 1; o <= l; o++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
        for (i = 1; i <= 5; i++) {
            for (h = 1; h < i; h++) {
                System.out.print(" ");
            }
            for (j = i; j <= 5; j++) {
                System.out.print("*");
            }
            for (k = i; k <= 5; k++) {
                System.out.print("*");

            }
            System.out.print("\n");

        }
    }

}