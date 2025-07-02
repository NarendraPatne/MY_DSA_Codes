import java.util.Scanner;

public class BinaryS {
    public static void BinSer(int arr[],int n)
    {
        int l,u,m;
        l=0; u=arr.length-1;
        while(l<=u)
        {
            m=(l+u)/2;
            if(arr[m]==n)
            {
                System.err.print(n+" is present at INdex "+m);
                break;
            }
            else if(arr[m]>n)
            {
                u=m-1;
            }
            else{
                l=m+1;
            }
        }
        if(l>u)
        {
            System.out.println("Element is not present in the array!!");
        }
    }
public static void main(String[] args) {
    int arr[]={10,20,30,40,50,60,70,80};
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.print("ENter Search Element:");
    n=sc.nextInt();
    BinSer(arr, n);
}    
}
