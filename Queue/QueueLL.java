public class QueueLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class LQueue{
        static Node head=null;
        static Node tail=null;
        // isEmpty
        public static boolean isEmpty()
        {
            return head==null && tail==null;
        }
        // add
        public static void add(int data)
        {
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        // remove
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue if Empty");
                return -1;
            }
            int res=head.data;
            // Single Element
            if(head==tail)
            {
                head=tail=null;
            }else{
                head=head.next;
            }
            return res;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue if Empty");
                return -1;
            }
            return head.data;
        }
        public static void print()
        {
            Node temp=head;
            System.out.print("Front:[");
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println("]:Rear");
        }
    }
    public static void main(String[] args) {
        LQueue q=new LQueue();
        q.add(3);
        q.add(6);
        q.add(8);
        q.add(10);
        q.print();
        q.remove();
        q.print();
        System.out.println(q.peek());
    }
}
