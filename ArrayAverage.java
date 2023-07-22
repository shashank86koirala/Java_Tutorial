import java.util.Scanner;

class ArrayAverage {
    public static void main(String[] args) {
        int avg, sum = 0;
        Scanner ref = new Scanner(System.in);
        int a[] = new int[5];
        System.out.print("enter data in array");
        for (int i = 0; i < a.length; i++) {
            a[i] = ref.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        avg = sum / a.length;

        System.out.print(" this is your average " + avg);
        System.out.print(" this is your average "+  a.length);

    }
}