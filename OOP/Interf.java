interface MyInterface
{
    // Constant (If we declare any normal variable it becomes constand by default (public+static+final))
    int x=10;
    // Abstract method (If we write normal method it becomes abstract+public by default)
    void Meth1();
    // default method with body can be overridden by class implementing the interface
    default void MethDef()
    {
        System.out.println("Default method in interface");
    }
    // Static method of interface which cannot be overridden
    static void MethSta()
    {
        System.out.println("Static method in interface");
    }
}
class MyClass implements MyInterface{
    // the abstract method must be implemented in class and it must be puclic
    public void Meth1()
    {
        System.out.println("Abstract method defined in class");
        System.out.println("Constant initialized in interface x:"+x);
    }
}
public class Interf {
    public static void main(String[] args) {
        // Static method can be called directly using interface without any object
        MyInterface.MethSta();
        MyClass m=new MyClass();
        m.Meth1();
        m.MethDef();
    }
}
