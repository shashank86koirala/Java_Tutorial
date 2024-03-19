public class Character {
    public static void main(String[] args) {
        char name='a';
        char[] name1=new char[]{'s', 'd'};
        System.out.println("checking name:::"+name); 
        System.out.println("checking name1:::"+name1); 
        for(char o:name1){
            System.out.println(o);
        }
    }
}
