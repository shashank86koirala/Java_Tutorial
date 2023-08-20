import java.util.Scanner;

class newKeyword {
    int a = 10;

    void num() {
        System.out.print(a);
    }

    public static void main(String[] args) {
        int size;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Array Size");
        size = obj.nextInt();
        int a[] = new int[size];
        System.out.print("Enter your array");
        for (int i = 1; i < a.length; i++) {
            a[i] = obj.nextInt();
        }
        System.out.println("Displaying Your Result");
        for(int m : a)
        {
            System.out.print(m+" ");
        }

        newKeyword ref = new newKeyword();
        ref.num();
    }
}