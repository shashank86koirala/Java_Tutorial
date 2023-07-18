import java.util.Scanner;

class Arithmetic {

    public static void main(String args[]) {
        int a;
        int b;

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter First number....");
                a = Input.nextInt();
        System.out.print("Enter Second number....");
        b = Input.nextInt();
        System.out.println("Your Addition " + (a + b));
        System.out.println("Your Multiplication " + (a * b));
        System.out.println("Your Division " + (a / b));
        System.out.println("Your Subract " + (a - b));

        System.out.print("Your Remainder " + (a % b));
    }
}