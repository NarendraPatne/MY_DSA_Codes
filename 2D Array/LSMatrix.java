
public class LSMatrix {
    public static void findLS(int matrix[][])
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]>largest)
                {
                    largest=matrix[i][j];
                }
                if(matrix[i][j]<smallest)
                {
                    smallest=matrix[i][j];
                }
            }
        }
        print(largest, smallest);
    }
    public static void print(int a,int b)
    {
        System.out.println("Largest No:"+a);
        System.out.println("Smallest No:"+b);
    }
public static void main(String[] args) {
    int matrix[][]={{10,2,30},{400,50,60}};
    findLS(matrix);
}    
}
