import java.util.Scanner;

class ArraySum {
    public static void main(String[] args) {
        int size, i, sum = 0;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter array size");
        size = ref.nextInt();
        int a[] = new int[size];
        System.out.print("enter array data");
        for (i = 0; i < size; i++) {
            a[i] = ref.nextInt();
        }
        System.out.print("store data ");
        for (i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        for (i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.print("Total is " + sum);
    }
}
