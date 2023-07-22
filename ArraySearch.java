import java.util.Scanner;

class ArraySearch {
    public static void main(String[] args) {
        int i, size, num, count = 0;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter Array Size");
        size = ref.nextInt();
        int a[] = new int[size];
        System.out.print("Enter Array Data");

        for (i = 0; i < a.length; i++) {
            a[i] = ref.nextInt();
        }
        System.out.print("store data");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.print("Enter search number");

        num = ref.nextInt();
        for (i = 0; i < size; i++) {
            if (a[i] == num) {
                count++;
            }

        }
        if (count >= 1) {
            System.out.print("Yes, it is in Array");

        } else {
            System.out.print("Yes, it is not in Array");

        }
    }
}
