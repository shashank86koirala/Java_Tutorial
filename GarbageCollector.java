public class GarbageCollector {
    public void finalize (){
        System.out.println("Object is collected by garbage collector");
    }

    public static void main(String[] args) {
        GarbageCollector my1 = new GarbageCollector();
        GarbageCollector my2 = new GarbageCollector();
        my1=null;
        my2=null;
        System.gc();
    }
}
