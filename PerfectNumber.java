import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] argus) {
        int a, sum = 0;
        Scanner ref = new Scanner(System.in);
        System.out.println("Entern your Number");
        a = ref.nextInt();
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == a) {
            System.out.println("congratulation its a perfect number");
        } else {
            System.out.println("its not a perfect number");
        }
    }
}