class Name {
    void input() {
        System.out.print("Enter you Name");
    }
}

class Ans extends Name {

    void name1() {
        System.out.print("Shashank Koirala");
    }
}

class Another extends Name {
    void name2() {
        System.out.print("Sosneya Koirala");
    }
}

class Hierarchical {
    public static void main(String[] args) {
        Ans ref = new Ans();
        Another ref1 = new Another();
        ref.input();
        ref.name1();
        ref1.input();
        ref1.name2();

    }
}