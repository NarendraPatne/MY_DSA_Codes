import java.util.Arrays;

public class Algs
    {
        public static void main(String[] args) {
            int arr[]={45,23,52,11,22,42,48};
            for(int i:arr)
            {
                System.out.print(" "+i);
            }
            // Uses Quick Sort 
            Arrays.sort(arr);
            System.out.println();
            for(int i:arr)
            {
                System.out.print(" "+i);
            }
            System.out.println();
            System.out.println(Arrays.binarySearch(arr, 11));
        }
    }