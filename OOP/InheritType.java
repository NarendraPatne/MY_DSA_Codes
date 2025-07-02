// Types of Inheritance in java : 4
public class InheritType {
    public static void main(String[] args) {
        // Single Inheritance
        Fish f=new Fish();
        f.eat();
        f.breathe();
        f.swim();
        // Multilevel Inheritance
        Dog d=new Dog();
        d.eat();
        d.breathe();
        d.birth();
        d.barks();
        // 
    }
}
// 1] Single Level Inheritance
class Animal{
    String color;
    void eat()
    {
        System.out.println("Eats");
    }
    void breathe()
    {
        System.out.println("Breathe");
    }
}
class Fish extends Animal
{
    void swim()
    {
        System.out.println("Swims");
    }
}
// 2] Multilevel Inheritance
class Animal2{
    String color;
    void eat()
    {
        System.out.println("Eats");
    }
    void breathe()
    {
        System.out.println("Breathe");
    }
}
class Mammals extends Animal2
{
    int legs;
    void birth()
    {
        System.out.println("Birth by feotus");
    }
}
class Dog extends Mammals
{
    void barks()
    {
        System.out.println("Bhow bhow!!");
    }
}
// 3] Hierarchial Inheritance
class Animal3{
    String color;
    void eat()
    {
        System.out.println("Eats");
    }
    void breathe()
    {
        System.out.println("Breathe");
    }
}
class Mammals2 extends Animal3
{
    int legs;
    void birth()
    {
        System.out.println("Birth by feotus");
    }
}
class Fish1 extends Animal3{
    void swim()
    {
        System.out.println("Swims");
    }
}
class Birds extends Animal3
{
    void Fly()
    {
        System.out.println("Flies");
    }
}
// 4] Hybrid Inheritance : combinaiton of multiple types of inheritance