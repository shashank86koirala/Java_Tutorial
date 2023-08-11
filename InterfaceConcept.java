interface Clientss {
    void design();

    void implementation();
}

abstract class Designer implements Clientss {
    public void design() {
        System.out.println("your deign table, form, color, size, demand");
    }
}

class Developers extends Designer {
    public void implementation() {
        System.out.println("coding, html, css, javascript");
    }
}

class timi {
    public static void main(String[] args) {
        Developers sc = new Developers();
        sc.design();
        sc.implementation();
    }
}