import java.util.Scanner;

class DecisionIf {

    public static void main(String args[]) {
        int age;
        System.out.print("Enter your age");
        Scanner ref = new Scanner(System.in);
        age = ref.nextInt();
        if (age > 18) {
            System.out.println("You are eligible for voting");
        } else {
            System.out.println("You are not eligible for voting");

        }
        System.out.println("Thank you");
    }

}