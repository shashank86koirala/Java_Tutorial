import java.util.Scanner;

class ArrayMirrorMatrix {
    public static void main(String[] args) {
        int i, j;
        int a[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Matrix");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Displaying your Matrix");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Displaying Mirror Matrix");
        for (i = 0; i < 2; i++) {
            for (j = 1; j >=0 ; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}