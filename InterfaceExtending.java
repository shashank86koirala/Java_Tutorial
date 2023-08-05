interface tamg {
    void add();
}

interface magar extends tamg {
    void sub();
}

class Developer implements magar {
    // @override
    public void add() {
        int a = 20, b = 40, c;
        c = a + b;
        System.out.println("this is your addition " + c);
    }

    // @override

    public void sub() {
        int a = 40, b = 30, c;
        c = a - b;
        System.out.println("this is your Subraction " + c);

    }
}

class Kina {
    public static void main(String[] args) {
        magar sc = new Developer();
        sc.add();
        sc.sub();
    }
}