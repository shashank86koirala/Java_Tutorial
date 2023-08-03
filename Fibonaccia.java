import java.util.Scanner;

class Fibonaccia {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0, num, tem=0;
        System.out.print("Enter the to number to see the range of Fibonaccia Series");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 1; i <= num; i++) {
            c = (tem-1) + i;
            tem = c;

            System.out.print(tem + " ");

        }

    }
}