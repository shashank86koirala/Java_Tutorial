class First
{
   String name="hello";
}

class Second
{

    String name="hello";
}


public class ObjeectClass{

    public static void main(String[] args) {
        First myFirst= new First();
        Second mySecond=new Second();

        if(myFirst.name.equals(mySecond.name)){
            System.out.print("every things are good");
        }else{
            System.out.print("it is worng");
        }
    }
}