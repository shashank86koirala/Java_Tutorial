
public class StringBufferDemo {
    public static void main(String[] ar){

        // StringBuffer sub=new StringBuffer();
        // System.out.println(sub.capacity());

        // sub.append("this shashank and im learing");
        // System.out.print("new capacity"+sub.capacity());

        // System.out.println("Checking length of the sub"+sub.length());
        // sub.append("im adding extra okay");
        // System.out.println("Checking length of the value"+sub);


        StringBuffer buff1=new StringBuffer("like");
        StringBuffer buff2=new StringBuffer("like");

        StringBuilder name= new StringBuilder("builder");
        StringBuilder name1= new StringBuilder("builder");
        name=name.append(" hello");

System.out.println("checking the value"+name);

        if(name.toString().equals(name1.toString())){
            System.out.println("this is builder;;;true");
        }else{
            System.out.println("this is builder; is false;"+name.equals(name1));
        }


        String names="hello";
        //String okay="hello";
        String okay=new String("hello");

        String okay1=new String("hello");

        
        System.out.println("This is string object"+okay.equals(okay1));

        StringBuffer firstName=new StringBuffer("hello");

        StringBuffer thirdName=firstName;
        System.out.println(firstName.equals(thirdName));

        StringBuffer secondName=new StringBuffer("hello");

        System.out.println(firstName.equals(secondName));

        if(names==okay){
            System.out.println("this is true;;;");
        }
        String str1=new String("hello");
        StringA myA=new StringA();
        StringB myB=new StringB();
        str1=str1.concat("hiasdfasdf");
        str1=str1.concat(" again concat");
        System.out.println("hello im in StringA"+str1);
        System.out.println("checking in different class"+myA.str1.equals(myB.str2));
        if(myA.str1==myB.str2){
            System.out.println("this is true;;;is for equals");
        }

        
    }
    
}

class StringA{
   // String str1=new String("hello");
    String str1="hello";
    // str1.concat("hi");
   
  
    
}

class StringB{
   // String str2=new String("hello");
    String str2="hello";
}