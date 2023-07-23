import java.util.Scanner;

class RecursiveFactorial {
    public static void main(String[] args) {
        int num;
        Scanner ref = new Scanner(System.in);
        System.out.print("enter number");
        num = ref.nextInt();
        RecursiveFactorial obj = new RecursiveFactorial();
        int result = obj.fac(num);
        System.out.print("Factorial of given number" + result);

    }

    int fac(int num) {
        if (num == 0) {
            return 1;

        } else {
            return num * fac(num - 1);
        }

    }
}
