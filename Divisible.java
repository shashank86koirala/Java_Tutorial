import java.util.Scanner;

class Divisible {
    public static void main(String[] args) {
        int a;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter any number ");
        a = ref.next().charAt(0);
        if (a % 5 == 0) {

            System.out.print("number is divisible by 5 ");

        } else {

            System.out.print("number is not divisible by 5 ");

        }

    }
}