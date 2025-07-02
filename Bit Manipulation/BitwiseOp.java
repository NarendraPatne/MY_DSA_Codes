
public class BitwiseOp {
    public static void main(String[] args) {
        // Binary AND & (Gives 1 only if both bits are 1)
        System.out.println("AND: 5 & 6 :"+(5&6));
        // Binary OR | (Gives 1 if any one of two bits is 1)
        System.out.println("OR: 5 | 6 :"+(5|6));
        // Binary XOR ^  (Gives 0 is both bits are same and 1 if bits are different)
        System.out.println("XOR: 5 ^ 6 :"+(5^6));
        // Binary One's Complement ~  (Works only on one bit at a time. Gives Opposite o/p 0~:1 1~:0 )
        System.out.println("1s Comp ~5 :"+(~5));
        System.out.println("1s Comp ~0 :"+(~0));
        // Binary Left shift: (<<) Shifts binary number by n bits to left side written on right of the operator
        System.out.println("5<<2: "+(5<<2));
        // Binary Right shift: (>>) Shifts binary number by n bits to right side written on right of the operator
        System.out.println("6>>1: "+(6>>1));
    }
}
