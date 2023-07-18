import java.util.Scanner;

class OddEven {
    public static void main(String[] argus) {
        int num, i, sum = 0;

        Scanner ref = new Scanner(System.in);
        System.out.print("Enter number to see odd number");
        num = ref.nextInt();
        if (num % 2 == 0) {
            for (i = 0; i <= num; i = i + 1) {
                if (i % 2 == 0) {
                    sum = sum + i;

                }
            }
            System.out.print(sum);

        } else {
            for (i = 0; i <= num; i = i + 1) {

                if (i % 2 != 0) {
                    sum = sum + i;

                }

            }
            System.out.print(sum);
        }

    }
}
