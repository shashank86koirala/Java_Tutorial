import java.util.Scanner;

class OddEvenNumber {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter Number");
        Scanner ref= new Scanner(System.in);
        a=ref.nextInt();
        if (a%2 == 0) {
            System.out.print("its a even number");
        } else {
            System.out.print("its a odd number");

        }

    }
}