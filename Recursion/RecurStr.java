import java.util.*;
public class RecurStr {
    // we can select one element only once
    public static void subSeqWithSumk2(int arr[],ArrayList<Integer> seq,int sum,int k,int i)
    {
        if(sum==k){
            System.out.println(seq);
            return;
        }
        if(i>arr.length-1)
        {
            return;
        }
        // not choose
        subSeqWithSumk2(arr, seq, sum, k, i+1);
        // choose
        seq.add(arr[i]);
        subSeqWithSumk2(arr, seq, sum+arr[i], k, i+1);
        seq.removeLast();
    }
    // We can select one element at index i any no of times
    public static void subSeqWithSum1(int arr[],ArrayList<Integer>seq,int sum,int k,int i)
    {
        if(sum==k)
        {
            System.out.println(seq);
            return;
        }
        if(i>arr.length-1)
        {
            return;
        }
        // choose:
        // 1] choose curr element if added to sum equals or less than the k
        if(sum+arr[i]<=k)
        {
            seq.add(arr[i]);
            subSeqWithSum1(arr, seq, sum+arr[i], k, i);
            seq.removeLast();
        }
        // 2] if not less than or equals to the k move to next index
        subSeqWithSum1(arr, seq, sum, k, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,4};
        ArrayList<Integer>list=new ArrayList<>();
        // subSeqWithSumk2(arr,list, 0, 15, 0);
        subSeqWithSum1(arr, list, 0, 4, 0);
    }
}
