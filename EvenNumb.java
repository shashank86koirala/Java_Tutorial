import java.util.Scanner;

class EvenNumb {
    public static void main(String[] argus) {
        int num, i;

        Scanner ref = new Scanner(System.in);
        System.out.print("Enter number to see odd number");
        num = ref.nextInt();
        for (i = 0; i <= num; i = i + 1) {
            if (i % 2 == 0) {
                System.out.print(i);

            }

        }
    }
}