public class NeedOfInterface {
    public static void main(String[] args) {
        
        AnyClass myObj=new SecondClass();
        AnyClass myObjRef=new ThirdClass();
        FirstClass myObj1=new FirstClass();
        myObj1.method(myObjRef);
        myObj1.method(myObj);
    }
}

class FirstClass{
public void method(AnyClass myObj){
    myObj.method();
}
}

/**
 * SecondClass
 */
 class SecondClass extends AnyClass {
public void method(){
    System.out.print("this is second method");
}
    
}

/**
 * InnerNeedOfInterface
 */
 class ThirdClass extends AnyClass {

public void method(){
    System.out.print("this is third another method using");
}
}

abstract class AnyClass{
    public abstract void method();
}