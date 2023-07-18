import java.util.Scanner;

class ShowOdd {
    public static void main(String[] argus) {
        int num, p, res = 1;

        Scanner ref = new Scanner(System.in);
        System.out.print("Enter Your number ");
        num = ref.nextInt();
        System.out.print("Enter Your power ");
        p = ref.nextInt();
        for (int i = 1; i <= p; i++) {
            res = res * num;
        }
        System.out.print(res);

    }
}