import java.util.Scanner;

public class LinearSearch {
    public static int LSearch(int arr[],int n)
    {
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(n==arr[i])
            {
                index=i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Element to Search:");
        n=sc.nextInt();
        int x=LSearch(arr, n);
        if(x==-1)
        {
            System.out.println("Element is not present in the array!!");
        }
        else{
            System.out.println(n+" is present at index "+x+" in array");
        }
    }
}
