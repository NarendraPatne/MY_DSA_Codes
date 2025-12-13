public class Q11GenerateSeq {
    public static int[] generateSequence(int N,int arr[])
    {
        if(N<=6)
        {
            return arr;
        }
        int result[]=new int[N];
        for(int i=0;i<arr.length;i++)
        {
            result[i]=arr[i];
        }
        for(int i=6;i<N;i++)
        {
            result[i]=result[i-1]+result[i-2];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int res[]=generateSequence(6, arr);
        for(Integer a:res)
        {
            System.out.println(a);
        }
    }
}
