
public class Cons {
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student("name",1);
        Student s2=new Student(s1);
    }
}
class Student{
    String name;
    int rno;
    // Explicit Default Constructor 
    Student()
    {
        System.out.println("Default Constructor Called");
    }
    // Parameterized Constructor
    Student(String n,int r)
    {
        name=n;
        rno=r;
        System.out.println("Parameterized Constructor called and initialization is done.");
    }
    Student(Student s)
    {
        this.name=s.name;
        this.rno=s.rno;
        System.out.println("Copy constructor called and initialization is done.");
    }
}
