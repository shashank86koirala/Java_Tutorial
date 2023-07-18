class NewOne {
    public static void main(String args[]) {
        test anu = new test();
        anu.show();
    }

}

class test {
    String car;
    int model;
    String branch;

    test() {
        car = "maruti";
        model = 00126;
        branch = "itahari";
    }

    void show() {
        System.out.print(car + " " + model + " " + branch);
    }

}
