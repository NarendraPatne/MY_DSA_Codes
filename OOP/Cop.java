
public class Cop {
    public static void main(String[] args) {
            Student s1=new Student("A",2);
            s1.marks[0]=70;
            s1.marks[1]=80;
            s1.marks[2]=90;
            System.out.println("S1: Name: "+s1.name+" Rno:"+s1.rno);
            System.out.println("Marks: Math:"+s1.marks[0]+" English: "+s1.marks[1]+" Science: "+s1.marks[2]);
            // Copying the properties of s1 object in object s2
            Student s2=new Student(s1);
            System.out.println("S2: Name: "+s2.name+" Rno:"+s2.rno);
            System.out.println("Marks: Math:"+s2.marks[0]+" English: "+s2.marks[1]+" Science: "+s2.marks[2]);
            System.out.println("--------------------------------Changing marks of s1 to 90 80 70");
            s1.marks[0]=90;
            s1.marks[1]=80;
            s1.marks[2]=70;
            // WE have modified the marks of the s1 object but if we check the modification is done in s1 and s2 both even if we have copied the properties of s1 in s2 before || This happens because of Shallow copy in copy constructor. 
            // In shallow copy the reference of the passed objects array is given to the current object array and no new array is created so if we make the changes to array in prev object the changes will also be visible in second object because its array is also pointing at same array in memory because of shallow copy
            System.out.println("After changing s1 marks checking s2 marks:");
            System.out.println("Marks: S2 Math:"+s2.marks[0]+" English: "+s2.marks[1]+" Science: "+s2.marks[2]);
    }
}
class Student{
    String name;
    int rno;
    int marks[];
    Student(String name,int rno)
    {
        marks=new int[3];
        this.name=name;
        this.rno=rno;
    }
    // Shallow copy constructor for array
    // Student(Student s)
    // {
    //     marks=new int[3];
    //     this.name=s.name;
    //     this.rno=s.rno;
    //     this.marks=s.marks; // This statement performs shallow copy just gives reference of its memory location to new array
    // }   
    // Deep copy constructor
    Student(Student s)
    {
        marks=new int[3];
        this.name=s.name;
        this.rno=s.rno;
        for(int i=0;i<s.marks.length;i++)
        {
            marks[i]=s.marks[i];
        }
    }
}