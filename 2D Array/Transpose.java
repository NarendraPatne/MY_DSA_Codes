public class Transpose{
    public static void main(String[] args) {
        int mata[][]={{1,2,3},{4,5,6}};
        int row=mata[0].length;
        int col=mata.length;
        int matb[][]=new int[row][col];
        for(int i=0;i<mata.length;i++)
        {
            for(int j=0;j<mata[0].length;j++)
            {
                matb[j][i]=mata[i][j];
            }
        }
        System.out.println("Matrix A:");
        for(int i=0;i<mata.length;i++)
        {
            for(int j=0;j<mata[0].length;j++)
            {
                System.out.print("matb["+i+"]["+j+"]="+mata[i][j]+"  ");;
            }
            System.out.println();
        }
        System.out.println("Transpose of matrix A:");
        System.out.println();
        for(int i=0;i<matb.length;i++)
        {
            for(int j=0;j<matb[0].length;j++)
            {
                System.out.print("matb["+i+"]["+j+"]="+matb[i][j]+"  ");;
            }
            System.out.println();
        }

    }
}