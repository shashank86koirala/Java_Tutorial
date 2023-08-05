import java.util.Scanner;

interface Client {
    void input();// public+abstract

    void output();// public+abstract
}

class InterfaceClient implements Client {
    String name;
    double salary;

    public static void main(String[] args) {
        InterfaceClient ref = new InterfaceClient();
        ref.input();
        ref.output();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your Salary:");
        salary = sc.nextDouble();
    }

    public void output() {
        System.out.println("Your Name: " + name + " Your Salary: " + salary);
    }
}