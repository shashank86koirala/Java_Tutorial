import java.util.Scanner;

class ArrayReverse {
    public static void main(String[] args) {
        int size, i;

        Scanner ref = new Scanner(System.in);
        System.out.println("enter array size");
        size = ref.nextInt();
        int a[] = new int[size];
        System.out.println("Enter Desire data");
        for (i = 0; i < size; i++) {
            a[i] = ref.nextInt();
        }
        System.out.println("store array");
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.print("in reverse order");
        for (i = a.length - 1; i >= 0; i--) {
            System.out.println("   "+a[i]);
        }

    }
}