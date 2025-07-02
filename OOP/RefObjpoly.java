// In java we can assign Parent class object with Child class reference
// This comes under the concept of polymorphism
// Syntax: ParentClass pobj=new ChildClass();
// But we cannot assign child class object with parent class reference.
class Animal{
    void eat()
    {
        System.out.println("Animal eats Something.");
    }
}
class Horse extends Animal{
    void eat()
    {
        System.out.println("Horse eats chana.");
    }
}
class Snake extends Animal
{
    void eat()
    {
        System.out.println("Snake eats frog.");
    }
}
public class RefObjpoly {
    public static void main(String[] args) {
        System.out.println("Animal object with reference of Animal class---------------------------");
        Animal a=new Animal();
        a.eat();
        // System.out.println("Animal object with reference of Horse class---------------------------");
        Animal a1=new Horse();
        a1.eat();
        System.out.println("Animal object with reference of Snake class---------------------------");
        Animal a2=new Snake();
        a2.eat();
    }
}
