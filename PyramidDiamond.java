class PyramidDiamond {
    public static void main(String[] args) {
        int i, j, k, l;
        for (i = 1; i <= 5; i++) {
            for (j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {

                System.out.print("*");
            }
            for (l = 1; l <= i; l++) {

                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (i = 1; i <= 5; i++) {
            for (j = 5; j < 1; j++) {
                System.out.print(" ");
            }
            for (k = 5; k <= 1; k--) {

                System.out.print("*");
            }
            for (l = 1; l <= i; l++) {

                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}