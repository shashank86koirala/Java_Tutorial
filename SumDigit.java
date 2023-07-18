import java.util.Scanner;

class SumDigit {
    public static void main(String[] args) {
        int n, r, sum = 0;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter any number");
        n = ref.nextInt();
        while (n > 0) {
            r = n % 10;
            sum = r + sum;
            n = n / 10;

        }
        System.out.print(sum);
    }
}