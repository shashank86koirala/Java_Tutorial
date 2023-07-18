import java.util.Scanner;

class SquarRoot {
    public static void main(String[] argus) {
        int a;
        Scanner ref = new Scanner(System.in);
        System.out.println("Entern your Number");
        a = ref.nextInt();
        double b = Math.sqrt(a);
        System.out.print(b);
    }
}