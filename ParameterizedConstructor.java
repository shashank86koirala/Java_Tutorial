class ParameterizedConstructor {
    public static void main(String[] args) {
        Inst obj = new Inst(200, 300);
        obj.dis();
    }
}

class Inst {
    int x, y;

    Inst(int a, int b) {
        x = a;
        y = b;
    }   

    void dis() {
        System.out.println(x + " " + y);
    }

}