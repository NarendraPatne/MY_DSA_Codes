public class First {
public static void main(String[] args) {
    int arr[][]=new int [4][4];
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[0].length;j++)
        {
            arr[i][j]=j;
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}    
}
