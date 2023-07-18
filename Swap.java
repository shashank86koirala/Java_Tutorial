import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        int a,b;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter First Number");
        a = ref.nextInt();
                System.out.print("Enter First Number");

        b = ref.nextInt();
               System.out.println("Before "+a+" "+b);
                a=a+b;
               b=a-b;
               a=a-b;
            //    temp=a;
            //    a=b;
            //    b=temp;
            System.out.print("After "+a+" "+b);         

    }
}