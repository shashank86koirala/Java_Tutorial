class Student {
    int roll, marks;
    String name;

    void input() {
        System.out.print("enter the data");
    }
}

class InheritanceSingle extends Student {
    public static void main(String[] args) {
        InheritanceSingle ref = new InheritanceSingle();
        ref.input();
        ref.display();
    }

    void display() {
        roll = 1;
        marks = 23;
        name = "Shashank koirala";
        System.out.println(roll + " " + marks + " " + name);
    }

}
