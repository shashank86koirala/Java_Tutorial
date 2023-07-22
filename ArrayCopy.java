import java.util.Scanner;

class ArrayCopy {
    public static void main(String[] args) {
        int size, i;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter Array Size");
        size = ref.nextInt();
        int a[] = new int[size];
        int b[] = new int[size];
        System.out.print("Enter data in Array");
        for (i = 0; i < a.length; i++) {
            a[i] = ref.nextInt();
        }
        System.out.println("Displaying Store data");
        for (i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        for (i = 0; i < b.length; i++) {
            b[i] = a[i];

        }
        System.out.print("Data store in b");
        for (i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
        }

    }
}