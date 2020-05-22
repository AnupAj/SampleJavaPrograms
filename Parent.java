class Parent
{
    //private methods are not overridden
    public void method1()
    {
        System.out.println("From parent method1()");
    }
    protected void method2()
    {
        System.out.println("From parent method2()" );
    }
    public static void method3()
    {
    System.out.println("From parent static method3()");
    }
}
class Child extends Parent
{
    //new method1() method
    //unique to Child class
    public void method1()
    {
        System.out.println("From child method1()");
    }
    //overriding method
    //with more accessibility
    @Override
    public void method2()
    {
        System.out.println("From child method2()");
    }
   //Hiding
    public static void method3()
    {
        System.out.println("From child static method3()");
    }
}
//Driver class
class MethodOverriding
{
    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.method3();
        obj1.method2();
        obj1.method1();
        Child obj2 = new Child();
        obj2.method3();
        obj2.method2();
        obj2.method1();
    }
}