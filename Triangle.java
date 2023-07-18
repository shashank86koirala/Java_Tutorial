import java.util.Scanner;

class Triangle {
    public static void main(String[] argus) {
        int a, b, c, res; 
        double area;

        Scanner ref = new Scanner(System.in);
        System.out.print("Enter First Side ");
        a = ref.nextInt();
        System.out.print("Enter Second Side ");
        b = ref.nextInt();
        System.out.print("Enter Third Side ");
        c = ref.nextInt();
        res = (a + b + c) / 2;
        area = Math.sqrt(res * (res - a) * (res - b) * (res - c));

        System.out.print("Area of Triangle " + area);

    }

}