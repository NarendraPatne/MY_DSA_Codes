
public class Inherit {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        shark.breathe();
        shark.breathe();
    }
}
// Base Class
class Animal{
    String color;
    void eat()
    {
        System.out.println("Eat");
    }
    void breathe()
    {
        System.out.println("Breaths");
    }
}
// Derived Class
class Fish extends Animal{
    int fins;
    void swim()
    {
        System.out.println("Swims in water");
    }
}

