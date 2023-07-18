import java.util.Scanner;

class Months {
    public static void main(String[] args) {
        int i;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter Your Number ");
        i = ref.nextInt();
        if (i == 1) {
            System.out.print("Jan 31 days");

        } else if (i == 2) {
            System.out.print("Feb 31 days");

        } else if (i == 3) {
            System.out.print("Mar 31 days");

        } else if (i == 4) {
            System.out.print("Apr 31 days");

        } else if (i == 5) {
            System.out.print("May 31 days");

        } else if (i == 6) {
            System.out.print("Jun 31 days");

        } else if (i == 7) {
            System.out.print("Jul 31 days");

        } else if (i == 8) {
            System.out.print("Aug 31 days");

        } else if (i == 9) {
            System.out.print("Sept 31 days");

        } else if (i == 10) {
            System.out.print("OCt 31 days");

        } else if (i == 11) {
            System.out.print("Nov 31 days");

        } else if (i == 12) {
            System.out.print("Dec 31 days");

        } else {
            System.out.print("Invalid month");

        }

    }
}