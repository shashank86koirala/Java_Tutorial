import java.util.Scanner;

class Char {
    public static void main(String[] args) {
        char name;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter any word");
        name = ref.next().charAt(3);
        System.out.print(name);

    }
}