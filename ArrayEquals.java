import java.util.Scanner;

import java.util.Arrays;

class ArrayEquals {

    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);
        int a[] = new int[6];
        int a2[] = new int[6];
        System.out.print("enter data in 1st array");
        for (int i = 0; i < a.length; i++) {
            a[i] = ref.nextInt();
        }
        System.out.print("enter data in 2nd array");
        for (int i = 0; i < a.length; i++) {
            a2[i] = ref.nextInt();
        }
        System.out.print("Displaying data of array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
        System.out.print("Displaying data of 1st array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
        System.out.print("Displaying data of 2nd array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a2[i]);

        }
        boolean b = Arrays.equals(a, a2);
       System.out.print(b);

    }
}