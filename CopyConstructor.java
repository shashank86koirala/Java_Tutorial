class CopyConstructor {
    public static void main(String[] args) {
        Among obj = new Among();
        Among refs = new Among(obj);
    }
}

class Among {
    int a, b;

    Among() {
        a = 22;
        b = 62;

        System.out.println(a + " " + b);

    }

    Among(Among ref) {
        a = ref.a;
        b = ref.b;

        System.out.println(a + " " + b);
    }
}