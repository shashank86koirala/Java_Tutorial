import java.util.Scanner;

class Palindromi {
    public static void main(String[] args) {
        int n, r, sum = 0, c;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter any number");
        n = ref.nextInt();
        c = n;
        while (n > 0) {
            r = n % 10;
            sum = r + (sum * 10);
            n = n / 10;

        }
        if (c == sum) {
            System.out.print("palindrom" ) ;

        }else{
                    System.out.print("Not palindrom");

        }
    }
}