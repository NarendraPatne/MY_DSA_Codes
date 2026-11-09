public class RecurPr3 {
    private static int nQueens(boolean [][]board,int r)
    {
        if(r==board.length)
        {
            display(board);
            return 1;
        }
        int count=0;
        for(int col=0;col<board.length;col++)
        {
            if(check(board, r, col))
            {
                board[r][col]=true;
                count+=nQueens(board, r+1);
                board[r][col]=false;
            }
        }
        return count;
    }
    private static boolean check(boolean [][]board,int r,int c)
    {
        int row=r,col=c;
        // curr pos to top col
        for(int i=0;i<r;i++)
        {
            if(board[i][c])
            {
                return false;
            }
        }
        // right diagonal
        while(r>=0 && c<board.length)
        {
            if(board[r--][c++])
            {
                return false;
            }
        }
        r=row;
        c=col;
        // left diagonal
        while(r>=0 && c>=0)
        {
            if(board[r--][c--])
            {
                return false;
            }
        }
        return true;
    }
    private static void display(boolean[][] board) {
        for(boolean[]row:board)
        {
            for(boolean col:row)
            {
                if(col){
                    System.out.print("Q ");
                }else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("========");
    }
    // ----------------------------------------------------
    // ----------------------------------------------------
    // N Knights Problem in a Chessboard
    public static void nKnights(boolean [][]board,int row,int col,int n)
    {
        if(n==0)
        {
            displayKnights(board);
            return;
        }
        if(row==board.length-1 && col==board.length)
        {
            return;
        }
        // if col is greater than last col then we move to next row first col
        if(col==board.length)
        {
            nKnights(board, row+1, 0, n);
            return;
        }
        // for each cell in a row try to put a knight at each cell
        // if we place a knight at a place we reduct the knights and call for next col
       if(checkKnight(board, row, col))
        {
            board[row][col]=true;
            nKnights(board, row, col+1,n-1);
            board[row][col]=false;
        }
        // if u cant place a knight at a curr cell then pass same no of knights for next cell
        nKnights(board, row, col+1, n);
        
    }
    private static boolean checkKnight(boolean[][] board, int row, int col) {
        if(isValid(board, row-2, col-1))
        {
            if(board[row-2][col-1])
            {
                return false;
            }
        }
        if(isValid(board, row-2, col+1))
        {
            if(board[row-2][col+1])
            {
                return false;
            }
        }
        if(isValid(board, row-1, col+2))
        {
            if(board[row-1][col+2])
            {
                return false;
            }
        }
        if(isValid(board, row-1, col-2))
        {
            if(board[row-1][col-2])
            {
                return false;
            }
        }
        return true;
    }
    private static boolean isValid(boolean [][]board,int row,int col)
    {
        if(row>=0 && row<board.length && col>=0 && col<board.length)
        {
            return true;
        }
        return false;
    }
    private static void displayKnights(boolean[][] board) {
        for(boolean[]row:board)
        {
            for(boolean col:row)
            {
                if(col){
                    System.out.print("K ");
                }else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("========");
    }
    public static void main(String[] args) {
        int x=4;
        boolean [][]board=new boolean[x][x];
        // System.out.println(nQueens(board,0));
        nKnights(board, 0, 0, 5);
    }
}
