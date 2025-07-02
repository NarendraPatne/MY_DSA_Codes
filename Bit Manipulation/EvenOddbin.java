
public class EvenOddbin {
    public static void checkEorO(int n)
    {
        int bitMask=1;
        System.out.println(n);
        if((n&bitMask)==0) // In the And operation java will convert the decimal number to binary any perform and opertion with 1 to get lsb and check if its 0 for even and 1 for odd.
        {
            System.out.println(n+" is Even Number");
        }else{
            System.out.println(n+" is Odd Number");
        }
    }
    public static void main(String[] args) {
        // We will pass decimal number to the function
        checkEorO(72);
    }
}
