public class Q5maxPerNoVow {
    public static int factorialPermutations(int num) {
        // Permutations means just count the factorial of the length of the string 
        // if length 0 then no permutations possible return 0
        if(num==0) return 0;
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int getMaxPerCountwV(String[]arr,int N)
    {
        // Array consists of strings including vowels
        int maxLen=0;
        // we search the length of string in array with max length after removal of vowels
        for(String s:arr)
        {
            String noVowString=s.toLowerCase().replaceAll("[aeiou]", "");
            maxLen=Math.max(maxLen,noVowString.length());
        } 
        return factorialPermutations(maxLen);
    }

    public static void main(String[] args) {
        String[] arr = { "HELLO","world" };
        int N = 1;
        System.out.println(getMaxPerCountwV(arr, N));
    }
}
