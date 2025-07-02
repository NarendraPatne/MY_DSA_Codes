// Static keyword is used to declare static members of the class that belongs to the class rather than the object of the class 
//  1] Static Variable
class Examp{
    static int x=100;
}
// 2] Static method
class Examp2{
    static void methodd()
    {
        System.out.println("This is static method accessed using the Classname");
    }
}
// 3] Static block 
class Examp3{
    static int c;
    static{
        c=100;
        System.out.println("Static block executed.");
    }
}
// 4] Static nested class (These inner class can be instantiated with the Outer class name only no object required) Static nested classes can only access the outer class static members.
class Outer{
    static int var=123;
    static class Inner{
        void Disp()
        {
            System.out.println("Static var of outer class var:"+var);
        }
    }
}

public class Statiic {
    public static void main(String[] args) {
            System.out.println(Examp.x);
            Examp2.methodd();
            System.out.println(Examp3.c);
            Outer.Inner i=new Outer.Inner();
            i.Disp();
    }
}
