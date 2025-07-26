import java.util.ArrayList;
public class Multi {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(3);
        list2.add(2);
        list2.add(1);
        mainList.add(list);
        mainList.add(list2);
        for(int i=0;i<mainList.size();i++)
        {
            ArrayList<Integer>clist=mainList.get(i);
            for(int j=0;j<clist.size();j++)
            {
                System.out.print(clist.get(j)+" ");
            }
            System.out.println();
        }
    }    
}
