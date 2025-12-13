import java.util.regex.*;;
public class RegularExpression {
    public static void main(String[] args) {
        // Regular Expression tool in java for defining string patterns
        // One kind of String formula that helps to find out string parts that follow it
        // All Regex classes are present in java.util.regex package
        // Pattern Class: used to define the pattern in string
        // Matcher Class: used to perform match operations using pattern on string sequence
        // Defining regex in string format
        // String regex="a";
        // We compile the regex to get the pattern
        // a*: 0 or more a 
        // a+: 1 or more a
        // a?: 1 or 0
        // a{n}: n times
        // a{n,m}: a in range n to m
        // [a-zA-Z]: one char in range a-z or A-Z
        // [a-zA-Z]+: 1 or more chars
        // ^: means start
        // $: ending 
        // .: any single character
        
        Pattern pattern=Pattern.compile(".");
        Matcher matcher=pattern.matcher("a");
        boolean matches=matcher.matches();
        System.out.println("Result:"+matches);
    }
}
