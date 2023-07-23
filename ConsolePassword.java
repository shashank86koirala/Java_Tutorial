import java.io.*;

class ConsolePassword {
    public static void main(String[] args) {
        String str;
        char ch[];
        Console obj = System.console();
        System.out.print("Enter User Name: ");
        str = obj.readLine();
        System.out.print("Enter Password: ");
        ch = obj.readPassword();
        String a = String.valueOf(ch);
        System.out.println("username: " + str);
        System.out.println("password: " + ch);
    }
}