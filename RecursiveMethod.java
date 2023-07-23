class RecursiveMethod {
    public static void main(String[] args) {
        RecursiveMethod ref = new RecursiveMethod();
        int a = ref.sum(3); 
        System.out.print("First Natural Number " + a);
    }

    int sum(int b) {
        if (b > 0) {
            return b + sum(b - 1);
        } else {
            return 0;
        }
    }
}