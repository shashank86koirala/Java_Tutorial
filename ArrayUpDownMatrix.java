import java.util.Scanner;

class ArrayUpDownMatrix {
    public static void main(String[] args) {
        int i, j;
        int a[][] = new int[2][3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your 2 by 2 matrix");
        for (i = 0; i < 2; i++) {
            for (j = 0; j <= 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Displaying your Matrix");
        for (i = 0; i < 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");

        }

         System.out.println("Displaying Up Down Matrix");
        for (i = 1; i >= 0 ; i--) {
            for (j = 0; j <= 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");

        }
    }
}