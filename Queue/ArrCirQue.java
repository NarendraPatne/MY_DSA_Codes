public class ArrCirQue {
    static class CQueue{
        static int []arr;
        static int size;
        static int front;
        static int rear;

        CQueue(int n){
            arr=new int[n];
            size=n;
            rear=front=-1;
        }
        public static boolean isEmpty()
        {
            return rear==-1 && front==-1;
        }
        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is Full");
                return;
            }
            // Adding first element
            if(front==-1) front=0;
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            int res=arr[front];
            if(rear==front)
            {
                // Deleting Last Element
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return res;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
        public static void print()
        {
            int f=front,r=rear;
            System.out.print("Front:[");
            while(f!=r)
            {
                System.out.print(arr[f]+" ");
                f=(f+1)%size;
            }
            System.out.print(arr[r]);
            System.out.println("]:Rear");
        }
    }
    public static void main(String[] args) {
        CQueue queue=new CQueue(3);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.print();
        queue.remove();
        queue.print();
        queue.add(56);
    }    
}
