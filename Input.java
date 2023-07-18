import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        int a, b;
        System.out.print("Enter any two number");
        Scanner ref = new Scanner(System.in);
        a = ref.nextInt();
        b = ref.nextInt();
        System.out.print("Your Numbers are" + " " + a + "   " + b);

    }
}