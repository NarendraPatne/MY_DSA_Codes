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
    Node tail;
    public void insertFirst(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=tail=node;
            return;
        }
        node.next=head;
        node.prev=null;
        head.prev=node;
        head=node;
    }
    public void print(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" <==> ");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public int removeFirst()
    {
        if(head==null)
        {
            System.out.println("DLL is Empty!");
            return Integer.MIN_VALUE;
        }
        if(head.next==null)
        {
            int v=head.data;
            head=tail=null;
            return v;
        }
        int t=head.data;
        head=head.next;
        head.prev=null;
        return t;
    }
    public void reverseDLL()
    {
        if(head==null || head.next==null)
        {
            return;
        }
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.prev=next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.insertFirst(30);
        dll.print();
        // dll.removeFirst();
        // dll.removeFirst();
        // dll.removeFirst();
        dll.reverseDLL();
        dll.print();
    }
}
