import java.util.Scanner;

class NaturalNum {
    public static void main(String[] args) {
        int a, n;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter a nmber you wanna see natural number");
        n = ref.nextInt();
        for (a = 1; a <= n; a++) {
            System.out.print(" "+a);
        }

    }
}