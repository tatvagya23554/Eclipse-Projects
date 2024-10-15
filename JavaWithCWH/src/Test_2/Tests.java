/*package Test_2;

public
class TestSameClass{
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

class TestSamePackage{
    TestSameClass TSC = new TestSameClass();
    void meth2(){
        System.out.println("a: " + TSC.a);
        System.out.println("b: " + TSC.b);
        System.out.println("c: " + TSC.c);
        //System.out.println("d: " + TSC.d);
    }
}

class TestSameSubClass extends TestSameClass{
    void meth3() {
        System.out.println("a: " + this.a);
        System.out.println("b: " + this.b);
        System.out.println("c: " + this.c);
        //System.out.println("d: " + this.d);
    }
}

public class Tests {
    public static void main(String[] args) {
        TestSameClass obj = new TestSameClass();
        obj.meth1();
        TestSamePackage obj_1 = new TestSamePackage();
        obj_1.meth2();
        TestSameSubClass obj_2 = new TestSameSubClass();
        obj_2.meth3();
    }

}*/
