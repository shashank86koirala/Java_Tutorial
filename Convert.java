import java.util.Scanner;
import java.lang.Character;

class Convert {
    public static void main(String[] args) {
        char a, b;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter any letter ");
        a = ref.next().charAt(0);
        if (a >= 'A' && a <= 'Z') {
            b = Character.toLowerCase(a);
            System.out.print("LowerCase " + b);

        } else {
            b = Character.toUpperCase(a);
            System.out.print("UpperCase " + b);

        }

    }
}