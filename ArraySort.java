import java.util.Scanner;

import java.util.Arrays;

class ArraySort {

    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        int a[] = new int[6];
        System.out.print("enter data in array");
        for (int i = 0; i < a.length; i++) {
            a[i] = ref.nextInt();
        }
        System.out.print("Displaying data of array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }

    }
}