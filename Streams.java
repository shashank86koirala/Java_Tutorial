import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Streams
{
    public static void main (String[] args)
    {
        List<String> myList= new ArrayList<>();

        myList.add("Shashank");
        myList.add("ranu");
        myList.add("rupesh");
        myList.add("mpowe");
        myList.add("mooran");

        // for(String my: myList){
        //     System.out.println("this is value"+my);
        // }

        myList.stream()
                .peek((String val)->System.out.print("value_______"+val));


       //System.out.println("count:"+myStream);
//        List<Integer> myList= Arrays.asList(1,2,2,2,5,6,8,42,59,254,555,222);
//
//       Boolean count=myList.stream()
//                .anyMatch((Integer val)->val==2);
//
//
//    System.out.print(count);
    }
}