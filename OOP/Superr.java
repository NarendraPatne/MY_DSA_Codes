// Super keyword in java is used to refer to the parent class of the child class
// We can use super keyword in following ways:
// 1] Access Parent class variable
class Parent{
    String name="papa";
}
class Child extends Parent{
    String name="baccha";
    void dispName()
    {
        System.out.println("Parent name:"+super.name);
        System.out.println("Child Name:"+name);
    }
}
// 2] Call parent class method
class Parent2{
    void greet()
    {
        System.out.println("Hello! Beta.");
    }
}
class Child2 extends Parent2
{
    void greet()
    {
        System.out.println("Hello! Papa");
    }
    void dispGreet()
    {
        super.greet();
        greet();
    }
}
// 3] Invoke parent class constructor
class Parent3{
    Parent3()
    {
        System.out.println("Parent class constructor");
    }
}
class Child3 extends Parent3
{
    Child3()
    {
        super();
        System.out.println("Called Parent class constructor from child class constructor.");
    }
}
public class Superr {
    public static void main(String[] args) {
        Child c=new Child();
        c.dispName();   
        System.out.println("------------------------------------");
        Child2 c2=new Child2();
        c2.dispGreet();
        System.out.println("------------------------------------");
        Child3 c3=new Child3();
    }
}
