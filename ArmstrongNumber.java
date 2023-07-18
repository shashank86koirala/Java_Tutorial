import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        int n, sum = 0, rem, c;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter any number ");
        n = ref.nextInt();
        c = n;
        while (n > 0) {
            rem = n % 10;
            sum = (rem * rem * rem) + sum;
            n = n / 10;

        }
        if (c == sum) {
            System.out.println("ITs armstrong number");
        } else {
            System.out.println("ITs not armstrong number");

        }

    }
}