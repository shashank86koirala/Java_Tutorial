import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        int a;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter any Year ");
        a = ref.nextInt();
        if (a % 100 == 0 && a % 400 == 0 || a % 100 != 0 && a % 4 == 0) {

            System.out.print("Its a leap year ");

        } else {
            System.out.print("its not leap year ");

        }

    }
}