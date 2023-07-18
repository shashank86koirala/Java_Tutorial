import java.util.Scanner;

class Relational {
    public static void main(String ar[]) {
        int a, b;

        Scanner ref = new Scanner(System.in);

        System.out.println("Enter your first number");
        a = ref.nextInt();
        System.out.println("Enter your second number");
        b = ref.nextInt();

        System.out.println("True/false  " + (a < b));
        System.out.println("True/false  " + (a >= b));
        System.out.println("True/false  " + (a <= b));
        System.out.println("True/false  " + (a != b));
        System.out.println("True/false  "+ ( a==b));

    }
}
