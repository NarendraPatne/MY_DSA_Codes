import java.util.*;
public class ExplorerAcsii {
    public static String getSymbolPair(String s,int target)
    {
        if(s.length()<2)
        {
            return "-1";
        }
        HashMap<Integer,Character>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char currChar=s.charAt(i);
            int currAscii=(int)currChar;
            int reqVal=target-currAscii;
            if(map.containsKey(reqVal))
            {
                if(map.get(reqVal)!=currChar)
                {
                    return ""+map.get(reqVal)+currChar;
                }
            }
            map.put(currAscii,currChar);
        }
        return "-1";
    }
    public static void main(String[] args) {
        System.out.println(getSymbolPair("abcde", 197));
        System.out.println(getSymbolPair("abcdef", 200));
    }
}
