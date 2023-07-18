import java.util.Scanner;

class Sum {
    public static void main(String[] argus) {
        int a, b, sum;
        Scanner ref = new Scanner(System.in);
        System.out.println("Entern First Number");
        a = ref.nextInt();
        System.out.println("Entern Second Number");
        b = ref.nextInt();
        sum = a + b;
        System.out.print(sum);
    }
}