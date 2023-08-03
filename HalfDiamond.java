class HalfDiamond {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
            // for (k = 5; k <= i; k--) {
            // System.out.print("*");
            // }

        }
        for (i = 4; i >=1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.print("\n");

        }

    }
}