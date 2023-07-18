import java.util.Scanner;

class Switch {
    public static void main(String args[]) {
        int a = 40, b = 2, cho;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter choice please\n");
        cho = ref.nextInt();
        switch (cho) {
            case 1:
                System.out.println("Sum" + " " + (a + b));
                break;
            case 2:
                System.out.println("Subract" + " " + (a - b));

                break;
            case 3:
                System.out.println("Multiplication" + " " + (a * b));

                break;
            case 4:
                System.out.println("Division" + " " + (a / b));

                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
    }

}