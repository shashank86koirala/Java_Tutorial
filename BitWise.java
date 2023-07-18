class BitWise {
    public static void main(String args[]) {
        int a = 5, b = 9;
        System.out.println("And " + (a & b));
        System.out.println("OR " + (a | b));
        System.out.println("XOR " + (a ^ b));
        System.out.println("Complement " + (~a));
    }
}