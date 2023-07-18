import java.util.Scanner;

class Greatest {
    public static void main(String[] argus) {
        int a, b, c;

        Scanner ref = new Scanner(System.in);
        System.out.print("Enter your first number ");
        a = ref.nextInt();
        System.out.print("Enter second number");
        b = ref.nextInt();
        System.out.print("Enter third number");
        c = ref.nextInt();
        if (a > b && a > c) {
            System.out.print("First number is your greatest number");
        } else if (b > c) {
            System.out.print("Second is your greatest number");
        } else {
            System.out.print("Third is your greatest number");
        }

    }
}