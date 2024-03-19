/**
 * Work
 */
public class Work extends Object {

     public static void main(String[] args) {
        String name="name";
        String name1="namsadfe";
        String name2=new String("name");
        String name3=new String("name");

        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());
       
        StringBuffer work=new StringBuffer("it");
        StringBuffer work1=work;
        String work3=work.toString();
        String work14=work1.toString();

        System.out.println(work.toString()==work1.toString());
        System.out.println(work.hashCode());
        System.out.println(work1.hashCode());
        System.out.println(work3.hashCode());
        System.out.println(work14.hashCode());
     
        InnerWork myObj=new InnerWork_1();
        InnerWork myObje=myObj;

        System.out.println("this myObj "+myObj.hashCode());
        System.out.println("this myObje "+myObje.hashCode());
        
        
}

}

/**
 * InnerWork
 */
 class InnerWork {

   void helo(){
      System.out.println("its helo");
   }
   
}

/**
 * InnerWork_1
 */
class InnerWork_1 extends InnerWork{
void hello(){
   System.out.println("hello");
}
   
}