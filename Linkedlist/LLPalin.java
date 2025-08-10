public class LLPalin {
     public static class Node{
        int data;
        Node next;
         Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        // Step 1 Create new Node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        // Step 2 Point newnode next to head
        newNode.next=head;
        // Step 3 Point head to newNode
        head=newNode;
    }
    public void addLast(int data){
        // Step 1 Create new Node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        // Step 2 Point tail.next to newNode
        tail.next=newNode;
        // Step 3 Point tail to newNode
        tail=newNode;
    }
    public void add(int ind,int data){
        if(ind==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<ind-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("Linkedlist is Empty.");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
          if(size==0){
            System.out.println("Linkedlist is Empty.");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        // prev: ind=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public static void printLL()
    {
        if(head==null){
            System.out.println("Linked List is Empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public int searchLL(int key){
        Node temp=head;
        int ind=0;
        while (temp!=null) {
            if(temp.data==key){
                return ind;
            }
            temp=temp.next;
            ind++;
        }
        return -1;
    }
    public int helper(Node head,int key){
         if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1)
            return -1;

        return idx+1;
    }
    public int searchR(int key){
        return helper(head, key);
    }
    public void reverseLL(){
        Node next;
        Node curr=tail=head;
        Node prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next; //+2
        }
        return slow;
    }
    public boolean isLLPalindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }
        // Step 1 Find MId
        Node midNode=findMid(head);
        // Step 2 Reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        // Step 3 compare left and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static boolean isCycleExist(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(Node head){
        // Detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false)
            return;
        // Find meeting Point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        // Remove Cycle
        prev.next=null;
    }
    public static void main(String[] args) {
 
        head=new Node(1);
        head.next=new Node(2);
        Node temp=new Node(25);
        head.next.next=temp;
        temp.next=new Node(3);
        temp.next.next=temp;
        System.out.println(isCycleExist(head));
        removeCycle(head);
        System.out.println(isCycleExist(head));
        printLL();
    }
}
