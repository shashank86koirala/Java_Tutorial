import java.util.Scanner;

class Tax {
    public static void main(String[] argus) {
        int income;
        double result = 0.0;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter Your Salary ");
        income = ref.nextInt();
        if (income <= 10000) {
            System.out.print("Tax is not added.");
        } else if (income >= 10000 || income <= 100000) {
            result = income * 0.1;
            System.out.print("Tax amount is " + result);
        } else {
            result = income * 0.2;
            System.out.print("Tax amount is " + result);
        }
    }

}