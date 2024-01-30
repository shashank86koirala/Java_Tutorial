import java.util.Scanner;

/**
 * practice
 */
public class practice {

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        practice arro = new practice();
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter first number::");
        double a = ref.nextDouble();
        System.out.println("Enter second number::");
        double b = ref.nextDouble();
        double sum = arro.add(a, b);
        System.out.println("result of addition:::" + sum);

    }
}