import java.util.Scanner;

class ArrayHigest {
    public static void main(String[] args) {
        int num;
        Scanner ref = new Scanner(System.in);
        int a[] = new int[4];
        System.out.print("Enter data in Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = ref.nextInt();
        }
        num = a[0];
        for (int i = 1; i < 4; i++) { 
            // for smallest use <
            if (a[i] > num) {
                num = a[i];
            }
        }
        System.out.print("Your higest number is");
        System.out.print(num);

    }
}