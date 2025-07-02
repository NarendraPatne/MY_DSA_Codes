import java.util.LinkedHashSet;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkhs=new LinkedHashSet<>();
        linkhs.add(12);
        linkhs.add(23);
        linkhs.add(41);
        linkhs.add(57);
        linkhs.add(35);
        linkhs.add(30);
        linkhs.add(30);
        // Ordered collection with unique values
        System.out.println(linkhs);
        System.out.println(linkhs.size());
        System.out.println(linkhs.isEmpty());
        System.out.println(linkhs.contains(35));
    }
}
