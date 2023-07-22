import java.util.Scanner;

class DynamicArray {
    public static void main(String[] args) {
        int size, i;
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter to your desire array");
        size = ref.nextInt();
        int a[] = new int[size];
        for (i = 0; i < size; i++) {
            a[i] = ref.nextInt();

        }
        System.out.print("Printed Array");
        for (i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }
}