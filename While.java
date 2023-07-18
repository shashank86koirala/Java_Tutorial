import java.util.Scanner;

class While {
    public static void main(String[] args) {
        int a = 1, n;

        Scanner ref = new Scanner(System.in);
        System.out.print("Entern Number");
        n = ref.nextInt();
        while (a <= n) {
            System.out.println("this is me");
                    a++;

        }
    }
}