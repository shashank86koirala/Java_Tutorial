import java.util.Scanner;

class FactorNumber {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any number ");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" "+i);  

            }
        }

    }
}