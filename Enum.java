public class Enum {
    
    public static void main(String[] args) {
      ImpEnm[] s=ImpEnm.values(); 


      
      for(ImpEnm value:s)
      System.out.println(value.getPrice());
    }

}

enum ImpEnm{
    Macbook(2000), Dell(1500), Legion(5000), Asus();
    public int price;


    public int getPrice(){
        return this.price;
    }

    private ImpEnm(int price){
        this.price=price;
    }
  

    private ImpEnm(){
        this.price=2000;
    }
}
