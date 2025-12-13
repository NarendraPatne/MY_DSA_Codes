public class Q34StarSumCount {
    public static int getStarSumCount(int N)
    {
        int count=0;
        for(int M=1;M<=N;M++)
        {
            if(starSum(M)>N)
            {
                count++;
            }
        }
        return count;
    }
    public static int starSum(int M)
    {
        String s=String.valueOf(M);
        int sum=0;
        for(int i=1;i<=s.length();i++)
        {
            sum+=Integer.parseInt(s.substring(0,i));
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(getStarSumCount(112));
    }
}
