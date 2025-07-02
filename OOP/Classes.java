public class Classes {
    public static void main(String[] args) {
        Pen p=new Pen();
        p.setColor("Black");
        p.setNip(10);
        System.out.println(p.color+p.tip);
        // ---------------------------------------------/
        BankAccount b=new BankAccount();
        b.username="User_NP";
        b.setPass("apssdff");
        // b.password="paosisdif";

    }
}
    class BankAccount{
        // Public attribute is accessible everywhere
        public String username;
        // private is accessible only in the class
        private String password;
        // We can access the private attributes of the class in class methods which are private
        // Using the class method which is public we can access the private attributes of the class
        public void setPass(String p)
        {
            password=p;
        }
    }
class Pen{
    String color;
    int tip;
    // Getter Function
    String getColor()
    {
        return this.color;
    }
    void setColor(String nCol)
    {
        color=nCol;
    }
    void setNip(int tip)
    {
        // here tip refers to the var which comes as argument and this.tip refers to var of current object
        this.tip=tip;
    }

}
class Student{
    String name;
    int age;
    void Percentage(int phy,int chem,int math)
    {
        System.out.println((phy+chem+math)/3);
    }
}
