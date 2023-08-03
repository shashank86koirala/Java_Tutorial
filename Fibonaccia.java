import java.util.Scanner;

class Fibonaccia {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0, num;
        System.out.print("Enter the to number to see the range of Fibonaccia Series");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 1; i <= num; i++) {
           c=a+b;
           a=b;
           b=c;

            System.out.print(c + " ");

        }

    }
}