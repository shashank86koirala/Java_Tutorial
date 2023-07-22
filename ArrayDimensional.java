import java.util.Arrays;

class ArrayDimensional {
    public static void main(String[] args)

    {
        String a[] = { "shashank", "bishal", "ranjit", "ram" };
        System.out.println("this toString one" + Arrays.toString(a));
        System.out.println("this is asList one" + Arrays.asList(a));

        String b[][] = { { "shashank", "timi" }, { "ram", "baba" } };
        System.out.println("this is deepToString one" + Arrays.deepToString(b));

    }
}