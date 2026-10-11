public class Linked {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        size++;
        head=newnode;
    }
    public void addLast(int data){
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        size++;
        tail=newnode;
    }
    public void add(int ind,int data)
    {
        if(ind==0)
        {
            addFirst(data);
            return;
        }
        Node newnode=new Node(data);
        int i=0;
        Node temp=head;
        while(i<ind-1)
        {
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        size++;
        temp.next=newnode;
    }
    public int removeFirst()
    {
        if(head==null)
        {
            System.out.println("LL is empty!");
            return -1;
        }
        int val=head.data;
        head=head.next;
        if(size==1) tail=null;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0)
        {
            return -1;
        }
        if(size==1){
            int v=head.data;
            head=head.next;
            return v;
        }
        Node prev=head;
        while(prev.next.next!=null)
        {
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public void printLL(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Linked LL=new Linked();
        LL.addFirst(10);
        LL.addLast(20);
        LL.addLast(30);
        LL.addLast(40);
        LL.addLast(50);
        LL.printLL();
        LL.add(2, 25);
        LL.printLL();
        LL.removeFirst();
        LL.printLL();
        LL.removeLast();
        LL.printLL();
    }
}
