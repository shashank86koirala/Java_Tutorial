import java.util.Scanner;

class Vowel {
    public static void main(String[] args) {
        char cou;
        System.out.print("Enter any letter");
        Scanner ref = new Scanner(System.in);
        cou = ref.next().charAt(0);
        if (cou == 'a' || cou == 'e' || cou == 'i' || cou == 'o' || cou == 'u') {
            System.out.print("Its a vowel letter");
        } else {
            System.out.print("Its a consonant letter");
        }
    }
}