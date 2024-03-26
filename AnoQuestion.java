 class  B{
    String me="hunn";

    public static void out()
    {
        System.out.println("hello");
    }
}


 class AnoQuestion extends B {
    public static void main(String[] args) {
        String name="hello";
        String name1=new String("hello");
        name.concat("okay");
        System.out.println("this is name::"+name);
        System.out.println(name==name1);
      if(name.equals(name1))
      {
        System.out.println(name.equals(name1));

      }
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
