  interface Chess {
    void moves();
 }
 class Queen implements Chess{
    public void moves()
    {
        System.out.println("up,down,left,right || all directions");
    }
 }
 class Rook implements Chess{
    public void moves()
    {
        System.out.println("up,down,left,right || All directions");
    }
 }
 class King implements Chess{
    public void moves()
    {
        System.out.println("up,down,left,right,diagonal  || 1 Step");
    }
 }
public class Chessint {
    public static void main(String[] args) {
        
    }
}
