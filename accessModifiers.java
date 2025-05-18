class c1{
    public int x = 5;
    protected int y = 6;
    int z = 7;
    private int w = 8;
    public void method1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
        //can access all the access modifiers inside the same class
    }
}

public class accessModifiers {
    public static void main(String[] args) {
        c1 c = new c1();
        c.method1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.w); //here every other access modifiers
        //can be used inside the similar package except private access modifier
    }
}
