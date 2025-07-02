import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {
public static void main(String[] args) {
    // ArrayList<String> students=new ArrayList<>();
    // students.add("A");
    // students.add("A");
    // students.add("A");
    // students.add("A");
    // students.add(2,"B");
    // System.out.println(students);
    // ArrayList<Integer> nums=new ArrayList<>();
    // nums.add(10);
    // nums.add(10);
    // nums.add(10);
    // nums.add(10);
    // nums.add(2,20);
    // System.out.println(nums);
    // ArrayList<Integer> n=new ArrayList<>();
    // n.add(30);
    // n.add(40);
    // n.add(50);
    // n.add(60);
    // System.out.println(n);
    // nums.addAll(n);
    // System.out.println(nums);
    // System.out.println(nums.get(2));
    // nums.remove(5);
    // System.out.println(nums);
    // nums.remove(Integer.valueOf(10));
    // System.out.println(nums);
    // System.out.println(n);
    // n.clear();
    // System.out.println(n);
    ArrayList<Integer> n=new ArrayList<>();
    n.add(30);
    n.add(40);
    n.add(50);
    n.add(60);
    System.out.println(n);
    n.set(2,5000);
    System.out.println(n);
    System.out.println(n.contains(5000));
    // Iterate through the whole list
    for(int i=0;i<n.size();i++)
    {
        System.out.println("Element at index "+i+"::"+n.get(i));
    }
    // Using for each loop
    // for(Integer e:n)
    // {
    //     System.out.println(e);
    // }
    // Iterator interface can also be used for iterating through the ArrayList
    Iterator<Integer> it= n.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next());
    }
}    
}
