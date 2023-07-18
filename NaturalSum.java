import java.util.Scanner;

class NaturalSum {
    public static void main(String[] args) {
        int n, i, sum = 0;
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.print(sum);
    }
}