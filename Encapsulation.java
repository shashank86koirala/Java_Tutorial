class Ap {
    private int value;

    public void setValue(int x) {
        value = x;
    }

    public int getValue() {
        return value;
    }

}

class Encapsulation {
    public static void main(String[] args) {
        Ap ref = new Ap();
        ref.setValue(100);
        System.out.print(ref.getValue());

    }
}