import java.util.Scanner;

class Day {
    public static void main(String[] args) {
        int a;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter any number ");
        a = ref.nextInt();
        switch (a) { 
            case (1):
                System.out.print("sunday");
                break;
            case (2):
                System.out.print("Monday");
                break;
            case (3):
                System.out.print("Tuesday");
                break;
            case (4):
                System.out.print("Wednesday");
                break;
            case (5):
                System.out.print("Thursday");
                break;
            case (6):
                System.out.print("Friday");
                break;
            case (7):
                System.out.print("Saturday");
                break;

            default:
                System.out.print("input 1 to 7");

                break;
        }

    }
}