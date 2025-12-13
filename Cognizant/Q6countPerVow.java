public class Q6countPerVow {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int countPerfixVow(String s) {
        int consonants = 0;
        
        String novow=s.toLowerCase().replaceAll("[aeiou]","");
        return factorial(novow.length());
    }
    // for (char ch : s.toCharArray()) {
        //     if (Character.isLetter(ch)) {
        //         char low = Character.toLowerCase(ch);
        //         if (low != 'a' && low != 'e' && low != 'i' && low != 'o' && low != 'u') {
        //             consonants++;
        //         }
        //     }
        // }

    public static void main(String[] args) {
        String S = "ABCdeeeeef";
        System.out.println(countPerfixVow(S));
    }
}
