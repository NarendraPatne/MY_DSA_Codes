public class DoublyLL {
    private class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head;
    public void insertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        head.prev=node;
        head=node;
    }
    public static void main(String[] args) {
        
    }
}
