public class TryCatch {
    public static void main(String[] args) {
        try {
            int a=12;
            int value= a/0;
            System.out.println("result::"+value);

        }
        finally {
            System.out.println("in finally");
        }

    }
}
