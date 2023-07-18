import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        int i, num, result = 1;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter Factorial Number ");
        num = ref.nextInt();
        for (i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.print(result);

    }
}