import java.util.Scanner;
class Ascii
{
    public static void main(String[] args)
    {
        char cou;
        Scanner ref=new Scanner(System.in);
        System.out.print("Enter any letter");
        cou=ref.next().charAt(0);
        int a= cou;
        System.out.print("Your given ASCII value is "+a);

    }
}