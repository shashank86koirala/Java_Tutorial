interface Implements1{
    void runn();
}

interface Implements2 extends Implements1,Implements3{
    void runn();
    void time();
}

interface Implements3 {
    void time();
}

class Implements implements Implements2
{

    public static void main(String[] args){
        Implements onj=new Implements();
        onj.time();
        onj.runn();
    
    }

    public   void time(){
        System.out.print("its 5:3");

    }
  public  void runn()
    {
        System.out.println("im running");
    }
 
}