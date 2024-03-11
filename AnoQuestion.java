 class  B{
    String me="hunn";

    public static void out()
    {
        System.out.println("hello");
    }
}


 class AnoQuestion extends B {
    public static void main(String[] args) {
       
        int x = 1, y = 2, z = 0;
        x = x++;
        y = ++x;
        z = x + y;
        System.out.println("value of z:::" + z);


    }

  


}

/**
 *  B extends AnoQuestion
 */
