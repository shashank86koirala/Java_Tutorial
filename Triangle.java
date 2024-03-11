import java.util.Scanner;

class Triangle {
    private final String NAME;

    Triangle(String NAME)
    {
        this.NAME=NAME;
    }

    public static void main(String[] argus) {
        int a, b, c, res; 
        double area;
    
        Triangle myObj=new Triangle("Shashank");
        Triangle myObj1=new Triangle("Himal");

       // myObj.NAME="hero";
       
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
        System.out.println("printing value" + myObj.NAME);
        System.out.println("printing value" + myObj1.NAME);

    }

}