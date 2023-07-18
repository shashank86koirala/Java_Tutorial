import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        int n, result;
        System.out.print("Enter any number ");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        while (n > 0) {
            result = n % 10;
            System.out.print(result);
            n = n / 10;
        }

    }
}