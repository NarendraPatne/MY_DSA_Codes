import java.util.HashMap;

public class CharHash {
    public static void charHashCalc(String str)
    {
        int arr[]=new int[26];
        char c=' ';
        for(int i=0;i<str.length();i++)
        {
            c=str.charAt(i);
            int ind=c-'a';
            arr[ind]++;
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        char v='a';
        while(v<='z')
        {
            System.out.print(v+" ");
            v++;
        }
    }
    public static void charHashMap(String str)
    {
        HashMap<Character,Integer>charHash=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            int c=0;
            if(charHash.containsKey(str.charAt(i)))
            {
                c=charHash.get(str.charAt(i));
            }
            charHash.put(str.charAt(i), c+1);
        }
        System.out.println(charHash);
    }
    public static void main(String[] args) {
        String str="aaabbcdddeeffffzxx";
        // charHashCalc(str);
        charHashMap(str);
    }
}
