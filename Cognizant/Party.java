public class Party {
    public static int partyMode(int input)
    {
        int bitMask=0b010101;
        return input^bitMask;
    }
    public static void main(String[] args) {
        int control=42;
        System.out.println(Integer.toBinaryString(control));
        System.out.println(partyMode(control));
        System.out.println(Integer.toBinaryString(partyMode(control)));
    }
}
