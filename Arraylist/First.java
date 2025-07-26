import java.util.ArrayList;
import java.util.Collections;
public class First{
    public static void printRev(ArrayList<Integer>list)
    {
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }
    }
    public static int findMax(ArrayList<Integer>list){
        int max=Integer.MIN_VALUE;
        for(Integer i:list){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    public static void swapVal(ArrayList<Integer>list,int i,int j){
        int temp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        // ArrayList<String>listt=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(5);
        list.add(2);
        list.add(7);
        // System.out.println(list);
        // System.out.println(list.size());
        // swapVal(list, 1, 3);
        // Collections.sort(list); //Ascending Order
        Collections.sort(list,Collections.reverseOrder()); // Descending Order
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        // System.out.println(findMax(list));
        // printRev(list);
    }
}