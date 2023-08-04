import java.util.Scanner;

class ArrayMatrixAdd {
    public static void main(String[] args) {
        int num, i, j;
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your First Matrix");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Displaying your First Matrix");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Enter your Second Matrix");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Displaying your Second Matrix");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");

        }

        System.out.println("Displaying your Addition of Matrix");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");

            }
            System.out.print("\n");
        }

    }

}