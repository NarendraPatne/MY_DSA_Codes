import java.util.HashSet;

public class ArrDup {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,4,5,5,6,7,8};
        HashSet<Integer>ele=new HashSet<>();
        HashSet<Integer>dup=new HashSet<>();
        for(int x:arr)
        {
            if(!ele.add(x))
            {
                dup.add(x);
            }
        }
        System.out.println(dup);
        String s="Programming";
        HashSet<Character>chr=new HashSet<>();
        HashSet<Character>dupp=new HashSet<>();
        for(char c:s.toCharArray())
        {
            if(!chr.add(c))
            {
                dupp.add(c);
            }
        }
        System.out.println(dupp);
        String rev=new StringBuilder(s).reverse().toString();
        System.out.println(rev);
        System.out.println(rev.equals("gnimmargorP"));
    }
}
