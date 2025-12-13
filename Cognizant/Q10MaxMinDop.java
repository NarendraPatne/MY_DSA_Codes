public class Q10MaxMinDop {
    public static String getMaxMinDopamine(int N,int L,int R,int []A)
    {
        int maxD=0;
        int minD=0;
        int currD=0;
        for(Integer a:A)
        {
            if(a>=L && a<=R)
            {
                currD++;
            }else{
                currD--;
            }
            maxD=Math.max(maxD, currD);
            minD=Math.min(minD, currD);
        }
        return maxD+" "+minD;
    }
    public static void main(String[] args) {
        int arr[]={12,15,18,10,20};
        int arr1[]={2,3,11,15};
        int arr2[]={4,3,2,1};
        int arr3[]={9,3,5};
        System.out.println(getMaxMinDopamine(5, 10, 20,arr ));
        System.out.println(getMaxMinDopamine(4, 5, 10,arr1 ));
        System.out.println(getMaxMinDopamine(4, 1, 3,arr2 ));
        System.out.println(getMaxMinDopamine(3, 1, 4,arr3 ));
    }
}
