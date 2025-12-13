import java.util.Stack;

public class NextGreater {
    // Next Greater Right: Loop from last to first and pop when top<=curr // This Problem
    // Next Greater Left : Loop from first to last and pop when top<=curr 
    // Next Smaller Right : Loop from last to first and pop when top>=curr 
    // Next Smaller Left : Loop from first to last and pop when top>=curr 
    public static void getNextGreater(int arr[],int nextGreater[])
    {
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            // Run Loop
            while(!s.isEmpty() && arr[s.peek()]<=arr[i])
            {
                s.pop();
            }
            // if-else
            if(s.isEmpty())
            {
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=arr[s.peek()];
            }
            // Push in stack
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int []arr={6,8,0,1,3};
        int nextGreater[]=new int[arr.length];
        getNextGreater(arr, nextGreater);
        for(int i:nextGreater)
        {
            System.out.print(i+" ");
        }
    }
}
