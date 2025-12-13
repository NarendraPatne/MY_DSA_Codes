@FunctionalInterface
interface Sample{
    void work();
}
class Doing implements Sample{
    public void work()
    {
        System.out.println("Work Implemented in Doing class");
    }
}
public class AnonClass {
    public static void main(String[] args) {
        // Without Anonymous class
        Doing d=new Doing();
        d.work();
        // Anonymous Class
        Sample s=new Sample(){
            public void work(){
                System.out.println("Work Implemented in Anonymous class");
            }
        };
        s.work();
        // Lambda Expression implementation of functional interface declared method
        Sample s2=()->{
            System.out.println("Work in Lambda Expression");
        };
        Sample s3=()->System.out.println("Work in Lambda in Shortest Form");
        s2.work();
        s3.work();
    }
}
