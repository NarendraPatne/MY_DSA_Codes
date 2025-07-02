import java.util.Scanner;

public class StrHash {
    public static void HashFun()
    {
        int n=0;
        Scanner s=new Scanner(System.in);
        // n=s.nextInt();
        int arr[]={3,5,2,5,2,12,19,17,19,13,1,1,2,3,6};
        n=arr.length;
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println("Arr["+i+"]:");
        //     arr[i]=s.nextInt();
        // }
        // Max value can be stored is 20
        int hash[]=new int[21];
        for(int i=0;i<n;i++)
        {
            hash[arr[i]]++;
        }
        System.out.print("Enter number to check its occurance:");
        int x=s.nextInt();
        System.out.println(hash[x]);
    }
    public static void main(String[] args) {
        HashFun();
    }
}
