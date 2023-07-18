import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {
        int a, num = 0;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter Multiplication Number");
        a = ref.nextInt();
        for (int i = 1; i <= 10; i++) {
            num = a + num;
            System.out.println(a + " * " + i + " = " + num);
        }
    }
}