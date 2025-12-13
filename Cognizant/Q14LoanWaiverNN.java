import java.util.*;
public class Q14LoanWaiverNN {
    public static int findLoantoWaive(int N,int[][]loans)
    {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                map.put(loans[i][j],map.getOrDefault(loans[i][j],0)+1);
            }
        }
        int min=Integer.MAX_VALUE;
        for(int key:map.keySet())
        {
            if(key>0 && map.get(key)==1)
            {
                min=Math.min(min,key);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int loans[][]={{1,1,3},{2,3,4},{3,4,5}};
        System.out.println(findLoantoWaive(3, loans));
    }
}
