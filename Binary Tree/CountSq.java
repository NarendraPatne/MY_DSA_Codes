
public class CountSq {
    static class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static int countSquareNodes(Node root)
    {
        int count=0;
        if(root==null) return 0;
        if(root.left!=null && root.left.data*root.left.data==root.data)
        {
            count++;
        }else if(root.right!=null && root.right.data*root.right.data==root.data)
        {
            count++;
        }
        return count+countSquareNodes(root.left)+countSquareNodes(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(16);
        root.left=new Node(4);
        root.right=new Node(4);
        System.out.println(countSquareNodes(root));
    }
}
