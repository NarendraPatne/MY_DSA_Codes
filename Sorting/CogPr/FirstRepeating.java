import java.util.HashSet;

public class FirstRepeating {
    public static void main(String[] args) {
        String s="adofijasdofij";
        HashSet<Character>set=new HashSet<>();
        for(char c:s.toCharArray())
        {
            if(set.contains(c))
            {
                System.out.println("First Repeating Character is: "+c);
                break;
            }
            set.add(c);
        }
    }
}
