import java.util.Scanner;

class ArrayDecs {
    public static void main(String[] args) {
        int temp, sum = 0;
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
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
        System.out.print("Displaying result after arranging the array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }
}