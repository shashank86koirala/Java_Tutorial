import java.util.Scanner;

public class IndexOut {
    int[] a=new int[4];
    public static void main(String[] args) {
        Scanner myScanner=new Scanner(System.in);
        IndexOut myIndex=new IndexOut();
    try{
        for(int i=0; i<=myIndex.a.length; i++){
            myIndex.a[i]=myScanner.nextInt();
        }
    }catch(ArrayIndexOutOfBoundsException e){
        //e.printStackTrace();
        System.out.println("Index is out of bound");
    }

    for(int y=0; y<=myIndex.a.length; y++){
        System.out.println("checkiing the data in array::"+myIndex.a[y]);
    }
      

    }
}
