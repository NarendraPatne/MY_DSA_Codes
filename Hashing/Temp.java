public class Temp {
    public static void main(String[] args) {
        int[] arr={2, 3, 5, 4, 5, 3, 4};
    int unique=0;
    for(int i:arr)
    {
        unique=unique^i;
    }
    System.out.println(unique);
    }
    
}
