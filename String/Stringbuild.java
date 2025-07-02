public class Stringbuild {
    public static void main(String[] args) {
        // StringBuilder class / Data Structure
        // StringBuilder class lets us to create mutable strings that can be directly modified into memory
        // They done create new string value in head memory and copy old one while modification
        // Instead they directly modify the string data in heap memory
        StringBuilder sb=new StringBuilder("");
        for(char c='a';c<='z';c++)
        {
            sb.append(c);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    } 
}
