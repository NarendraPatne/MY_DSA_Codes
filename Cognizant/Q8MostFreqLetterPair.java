import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;

public class Q8MostFreqLetterPair {
    public static String getMostFreqPair(String sentence)
    {
        String[] words=sentence.split("\\s+");
        LinkedHashMap<String,Integer>map=new LinkedHashMap<>();
        for(String word:words)
        {
            String s=""+word.charAt(0)+word.charAt(word.length()-1);
            map.put(s, map.getOrDefault(s,0)+1);
        }
        int max=Collections.max(map.values());
        for(String s:map.keySet())
        {
            if(map.get(s)==max)
            {
                return s;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3};
        String sentence="she is good grid god and ground player plotter";
        System.out.println(getMostFreqPair(sentence));
    }
}
