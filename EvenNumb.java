import java.util.Scanner;

class EvenNumb {
    public static void main(String[] argus) {
        // int num, i;

        // Scanner ref = new Scanner(System.in);
        // System.out.print("Enter number to see odd number");
        // num = ref.nextInt();
        // for (i = 0; i <= num; i = i + 1) {
        //     if (i % 2 == 0) {
        //         System.out.print(i);

        //     }

        // }

        AnotherOverLoad ref1=new AnotherOverLoad();
        ref1.overLoad();
        // ref1.overLoad("hello");
        // ref1.overLoad("OMG", 12);
        ref1.sum();
    }

  
}

 class OverLoading{
    public final int NUM=45;
     OverLoading overLoad(){
        System.out.println("okay");
        return  new OverLoading();

    }
    public  void overLoad(String a){
System.out.println(a);
    }

    public  void overLoad(String a, int b){
        System.out.println(a);
        System.out.println(b);
            }
}
class AnotherOverLoad {

    OverLoading ref=new OverLoading();

   // @Override
     AnotherOverLoad overLoad(){
        System.out.println("im in sub classs");
       return this;
    }
    // public  void overLoad(String a){
    //     System.out.println("it is in subclass"+a);
    //         }

    public void sum(){
        int sum= ref.NUM+4;
        System.out.println("printing sum::"+sum);
    }
}