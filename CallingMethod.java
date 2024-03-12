
public class CallingMethod extends Amain{
    public static void main(String[] args) {

        Amain myObj= new CallingMethod();
      //Test myObj2=new Test();

      myObj.show();
      myObj.show(25, "shashaank");
     // myObj2.show(36,"himal");
    }
    public  void show(int num,String name)
    {
        System.out.println("this is from test classage::"+num+"  name::"+name);
    }
    public static void show()
    {
        System.out.println("hellow im test class++++++");
    }

}
class Amain{
 protected static void show(){
        System.out.println("hello i m A class");
    }
    
    public  void show(int num,String name)
    {
        System.out.println("age::"+num+"  name::"+name);
    }
}


