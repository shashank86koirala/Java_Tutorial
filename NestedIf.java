import java.util.Scanner;

class Nested {

    public static void main(String args[]) {
        int a, b, c;
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter first number");
        a = ref.nextInt();
        System.out.println("Enter second number");

        b = ref.nextInt();
        System.out.println("Enter third number");

        c = ref.nextInt();

        if ((a != b) && (a !=  c ) &&( b!=c)) {
            if (a >= b) {
                if (a >= c) {
                    System.out.println("a");

                } else {
                    System.out.println("c");

                }

            } else {
                if (b >= c) {
                    System.out.println("Enter b greater");

                } else {
                    System.out.println("Enter c greater");

                }
            }

        } else {
            System.out.print("timi");
        }

    }
}
