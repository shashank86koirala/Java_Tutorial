import java.util.ArrayList;
import java.util.List;

public class GenericClass {
    
    public static void main(String[] args) {
        
        InnerGenericClass<String> myobj = new InnerGenericClass<String>("this is generic class");
        System.out.println("value+++" + myobj.getVal());

        InnerGenericClass<Integer> myobj1 = new InnerGenericClass<Integer>(12);
        System.out.println("value+++" + myobj1.getVal());

     

        List<Object> elements=new ArrayList<>();
      
      //  myGeneric.setName("shashank");
        elements.add("elementst");
        elements.add("this3");
        elements.add("asdf");
        elements.add("adf21312elemasdfentst");
        elements.add("elwwqer3423ementst");
        List<Object> lis = new ArrayList<>(); // Declare lis before using it
       
        System.err.println("what in this elements::"+elements);
        InnerGenericClass<List<Object>> myGeneric = new InnerGenericClass<List<Object>>(elements);
        lis.add(elements);
        System.out.println("what is in lis"+lis);

        System.out.println("value+++ of elements" + myGeneric.getElement());
    }
    
}

class InnerGenericClass<T> {

    T name;
    T elements;

    // public InnerGenericClass(T name){
    //     this.name = name;
       
    // }
    public InnerGenericClass(T elements){
  
        this.elements=elements;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void setElements(T elements){
        this.elements=elements;
    }

    public T getElements(){
        return elements;
    }

    public T getVal() {
        return this.name;
    }

    public T getElement() {

        return this.elements;

    }
}