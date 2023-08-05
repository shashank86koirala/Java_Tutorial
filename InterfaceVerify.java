interface Clients {
    int amount = 50; // public+static+ final

    public abstract void purchase(); // public and abstract
}

class Seller implements Clients {
    public void purchase() {
        // amount = 56;
        System.out.print("Your amout of rice " + amount);

    }
}

class InterfaceVerify {
    public static void main(String[] args) {
        Clients sc = new Seller();
        sc.purchase();
    }
}