import java.util.Scanner;

class RangePrimeNumber {
    public static void main(String[] argus) {
        int a, b, i, j;
        int count = 0;
        Scanner ref = new Scanner(System.in);
        System.out.println("Entern your first Number");
        a = ref.nextInt();
        System.out.println("Entern your second Number");

        b = ref.nextInt();

        for (i = a; i < b; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    break;

            }
            if (i == j)
                System.out.println(j);
        }

    }
}