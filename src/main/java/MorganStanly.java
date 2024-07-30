public class MorganStanly {
    public static void main(String[] args) {
        /*try {
            throw new NullPointerException("Hello");
            System.out.println("A");
        }
        catch (ArithmeticException e)
        {
            System.out.println("B");
        }*/
//        Base b = new Derived();
//        b.show();
        /*int x= 0; int y= 0;
        for (int z = 0; z < 5; z++)
        {
            if ((++x>2) || (++y >2))
            {
                x++;
            }
        }
System.out.println(x + " " + y);*/
        /*OuterClass outer = new OuterClass();
        OuterClass.InnerClass = new OuterClass().InnerClass();
        outer.InnerClass inner = new outer.Innerclass();
        'we can't initialise inner class'*/
    }
    Object methodA()
    {
        Object obj1 = new Object();
        Object []obj2 = new Object[1];
        obj2[0]=obj1;
        obj1=null;
        return obj2[0];
    }
    public static class OuterClass {
        public class InnerClass {
            public void foo() {
                System.out.println("Inner Class");
            }
        }
    }
    class Base {
        public void show() {
            System.out.println("Base: show() called");
        }
    }
//
//    static class Derived extends Base{
//        public void show() {
//            System.out.println("Derived::show() called");
//        }
//    }


}
