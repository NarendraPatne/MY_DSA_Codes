import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreex {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void preOrder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root==null){
                System.out.print("-1 ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root==null)
            {
                System.out.print("-1 ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelOrder(Node root){
            if(root==null)
            {
                return;
            }
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                Node curr=q.remove();
                if(curr==null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curr.data+" ");
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }
        }
        public static int treeHeight(Node root)
        {
            if(root==null) return 0;
            int lh=treeHeight(root.left);
            int rh=treeHeight(root.right);
            return Math.max(lh,rh)+1;
        }
        public static int countNodes(Node root){
            if(root==null)
            {
                return 0;
            }
            int leftCount=countNodes(root.left);
            int rightCount=countNodes(root.right);
            int curr=leftCount+rightCount+1;
            return curr;
        }
        public static int sumNodes(Node root)
        {
            if(root==null) return 0;
            int leftSum=sumNodes(root.left);
            int rightSum=sumNodes(root.right);
            int currSum=leftSum+rightSum+root.data;
            return currSum;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};       
        BinaryTree tree=new BinaryTree(); 
        Node root=tree.buildTree(nodes);
        System.out.print("Preorder:");
        tree.preOrder(root);
        System.out.println();
        System.out.print("Inorder:");
        tree.inOrder(root);
        System.out.println();
        System.out.print("Postorder:");
        tree.postOrder(root); 
        System.out.println();
        System.out.println("Level Order:");
        tree.levelOrder(root);
        System.out.println("Height of Tree:"+tree.treeHeight(root));
        System.out.println("Count of Nodes:"+tree.countNodes(root));
        System.out.println("Sum of Nodes:"+tree.sumNodes(root));
        // Temp Tree Creation
        Node root1=new Node(4);
        root1.left=new Node(5);
        root1.right=new Node(6);
        root1.left.left=new Node(6);
        root1.left.right=new Node(7);
        root1.right.left=new Node(1);
        root1.right.right=new Node(1);
        System.out.println("Sum of Temp Tree Nodes:"+tree.sumNodes(root1));
    }
}
