import java.util.Scanner;

class Digits {
    public static void main(String[] args) {
        int i, result = 0;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter Your Number ");
        i = ref.nextInt();
        while (i > 0) {
            i = i / 2;
            result++;
        }
        System.out.print(result);

    }
}