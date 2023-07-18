import java.util.Scanner;

class Ladder {
    public static void main(String[] args) {
        int a, b, c;
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter first number");
        a = ref.nextInt();
        System.out.println("Enter second number");
        b = ref.nextInt();
        System.out.println("Enter third number");
        c = ref.nextInt();
        if((a>b)&(a>c)){
        System.out.println("Enter a is greater number");

        }
        else if((b>a)&(b>c)){
        System.out.println("Enter b is greater number");

        }
        else{
        System.out.println("Enter c is greater number");

        }
    }
}