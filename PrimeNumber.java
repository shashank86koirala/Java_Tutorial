import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] argus) {
        int a, count = 0;
        Scanner ref = new Scanner(System.in);
        System.out.println("Entern your Number");
        a = ref.nextInt();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;

            }
        }

        if (count == 2) {
            System.out.print("its prime number");

        } else {
            System.out.print("its not prime number");

        }
    }
}