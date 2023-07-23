import java.util.Scanner;
import java.util.Arrays;

class ArrayCopyOf {

    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        int a[] = new int[6];
        System.out.print("enter data in 1st array");
        for (int i = 0; i < a.length; i++) {
            a[i] = ref.nextInt();
        }
        int a2[] = Arrays.copyOf(a, 6);
        System.out.print("enter data in a2 array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+ a2[i]);

        }
    }
}