import java.util.ArrayList;
import java.util.List;

public class OutOfMemory {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        
        // try {
            while (true) {
                int[] array = new int[Integer.MAX_VALUE]; // Allocating a very large array
                list.add(array);
            }
        // } catch (OutOfMemoryError e) {
        //     System.out.println("Out of memory error occurred!");
        //     e.printStackTrace();
        // }
    }
}
