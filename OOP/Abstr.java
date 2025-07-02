abstract class Animal
{
    // Abstract class can have constructors 
    // The constructor of abstract gets called when instance of its subclass is created.
    String color;
    Animal()
    {
        System.out.println("Animal constructor called.");
        color="Black";
    }
    void eat()
    {
        System.out.println("Animal eats");
    }
    abstract void walk();
}
class Horse extends Animal
{
    Horse()
    {
        System.out.println("Horse constructor called.");
    }
    void changeColor()
    {
        color="White";
    }
    void walk()
    {
        System.out.println("Runs on four legs.");
    }
}
class Mustang extends Horse{
    Mustang()
    {
        System.out.println("Mustang constructor called");
    }
}
class Chicken extends Animal
{
    void changeColor()
    {
        color="Brown";
    }
    void walk()
    {
        System.out.println("Walks on two legs");
    }
}
public class Abstr {
    public static void main(String[] args) {
         // We cannot make instance of abstract class
        // Animal a=new Animal();
            // Horse h=new Horse();
            // h.eat();
            // h.walk();
            // h.changeColor();
            // System.out.println(h.color);
            // Chicken c=new Chicken();
            // c.eat();
            // c.walk();
            // c.changeColor();
            // System.out.println(c.color);
            // If we are using abstract classes then if we create the subclass object 
            // then first abstract class constructor will be called then the subclass constructors.
            Mustang m=new Mustang();
    }
}
