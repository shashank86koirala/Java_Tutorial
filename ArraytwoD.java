import java.util.Scanner;

class ArraytwoD {
    public static void main(String[] args) {
        int i, j;
        int a[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two matrix numbers");
        for (i = 0; i < 2; i++) // rows
        {
            for (j = 0; j < 2; j++) // columns
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Displaying Results \n");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.print("\n");
        }

    }
}