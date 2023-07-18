import java.util.Scanner;

class Logic {
    public static void main(String[] arus) {
        int a, b, c;
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter first number");
        a = ref.nextInt();
        System.out.println("Enter second number");
        b = ref.nextInt();
        System.out.println("Enter third number");
        c = ref.nextInt();
        System.out.println("And Gate");
        System.out.println((a > b) && (c > b));
        System.out.println((b > c) && (a > c));
        System.out.println((c > a) && (c > b));
        System.out.println((a >= b) && (c >= b));
        System.out.println((a < b) && (c > b));
        System.out.println(" ");

        System.out.println("Not Gate");


        System.out.println(!(a > b));
        System.out.println(!(b > c) );
        System.out.println(!(c > a));
        System.out.println(" ");

       
    }
}