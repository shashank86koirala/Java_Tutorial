class Aone {
    Aone show1() {
        System.out.print("showing error guys");
        return new Aone();

    }
}

class Bone extends Aone {
    @Override
    Bone show1() {
        System.out.print("another error");
        return this;
    }
}

class Covarient {
    public static void main(String[] args) {
        Bone ref = new Bone();
        ref.show1();
    }
}