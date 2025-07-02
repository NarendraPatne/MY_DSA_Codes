public class Compare {
    public static void main(String[] args) {
        String a="apple";
        String b="apple";
        String c=new String("apple");
        // == operator works well with strings initialised without new keyword
        if(a==b)
        {
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        System.out.println("--------------------------");
        // == doesnt work correct for strings initialised with new keyword it gives not equal even if they are equal
        if(a==c)
        {
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        System.out.println("-------------------------------");
        // As == doesnt work correct we use equals method in java to compare the strings
        if(a.equals(c))
        {
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

    }
}
