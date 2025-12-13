public class Q40CountElements {
    public static void countElements(String sentence)
    {
        int digit=0,letter=0,white=0,special=0;
        for(char c:sentence.toCharArray())
        {
            if(Character.isLetter(c))
            {
                letter++;
            }else if(Character.isDigit(c))
            {
                digit++;
            }else if(Character.isWhitespace(c))
            {
                white++;
            }else{
                special++;
            }
        }
        System.out.println("Letters:"+letter+"  Digits:"+digit+"\n WhiteSpaces:"+white+" Special Characters:"+special);
    }
    public static void main(String[] args) {
        countElements("Amcatuff@ #% 123");
    }
}
