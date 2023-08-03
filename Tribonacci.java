import java.util.Scanner;
class Tribonacci
{
    public static void main(String[] args) {
        int i,a=0,b=1,c=2,sum, num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Entern the number for range to see Tribonacci Serise");
        num=sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(c+" ");
        for(i=1; i<=num; i++)
        {
            sum=a+b+c;
            a=b;
            b=c;
            c=sum;
            System.out.print(sum+" ");

        }

    }
}