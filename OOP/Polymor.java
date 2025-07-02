public class Polymor {
    public static void main(String[] args) {
        // Calculate c=new Calculate();
        // System.out.println(c.Sum(10, 20));
        // System.out.println(c.Sum(10,20, 30));
        // System.out.println(c.Sum(12.34f, 10.3f));
        Animal a=new Animal();
        Cat cx=new Cat();
        a.eat();
        cx.eat();;
    }
}
// Function overloading
class Calculate
{
    int Sum(int a,int b)
    {
        return a+b;
    }
    int Sum(int a,int b,int c)
    {
        return a+b+c;
    }
    float Sum(float a,float b)
    {
        return (float)a+b;
    }
}
// Function Overriding
class Animal
{
    void eat()
    {
        System.out.println("Eats something");
    }
}
class Cat
{
    void eat()
    {
        System.out.println("Eats mouse.");
    }
}