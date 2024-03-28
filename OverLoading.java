// Source code is decompiled from a .class file using FernFlower decompiler.
class OverLoading {
    public final int NUM = 45;
 public static void main(String[] args) {
  OverLoading myLoading=new OverLoading();
  myLoading.overLoad();
  myLoading.overLoad("shsashank");
  myLoading.overLoad("shsashank",2);
 }
 OverLoading() {
}

OverLoading overLoad() {
   System.out.println("okay");
   return new OverLoading();
}


public String overLoad(String var1) {
   System.out.println(var1);
   return "run";
}

public void overLoad(String var1, int var2) {
   System.out.println(var1);
   System.out.println(var2);
}
 }
 
