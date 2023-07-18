import java.util.Scanner;

class ShowOdd {
    public static void main(String[] argus) {
        int num, i;

        Scanner ref = new Scanner(System.in);
        System.out.print("Enter number to see odd number");
        num = ref.nextInt();
        for (i = 1; i <= num; i = i + 2) {
            System.out.print(i);

        }
    }
}