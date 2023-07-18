import java.util.Scanner;

class OddNum {
    public static void main(String[] args) {
        int i, num, add = 0;
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter Number");
        num = ref.nextInt();
        for (i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                add = add + i;
            }
        }
        System.out.println(add);

    }
}