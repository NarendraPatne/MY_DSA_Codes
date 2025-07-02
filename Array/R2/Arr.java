public class Arr {
    public static int Linear(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int Largest(int arr[]) {
        int lar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }
        }
        return lar;
    }

    public static int BinSer(int arr[], int x) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void Revarr(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }

    public static void PairsArr(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ")  ");
            }
            System.out.println();
        }
    }

    public static void SubArr(int arr[]) {
        int t = 0,maxSum=Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ",");
                    sum=sum+arr[k];
                }
                System.out.print("] || Sum:"+sum);
                System.out.println();
                t++;
                if(maxSum<sum){
                    maxSum=sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total Subarrays:" + t);
        System.out.println("Max Subarray Sum:" + maxSum);
    }
    public static void prefixSum(int arr[])
    {
        int prefixArr[]=new int [arr.length];
        // Calculate Prefix Array
        prefixArr[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            prefixArr[i]=prefixArr[i-1]+arr[i];
        }
        // if(start==0)
        // {
        //     return prefixArr[end];
        // }
        // return (prefixArr[end]-prefixArr[start-1]);
        int maxSum=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<prefixArr.length;i++)
        {
            for(int j=i;j<prefixArr.length;j++)
            {
                sum=(i==0?prefixArr[j]:prefixArr[j]-prefixArr[i-1]);
            }
            if(maxSum<sum)
            {
                maxSum=sum;
            }
        }
        System.out.println("Maximum Sum:"+maxSum);
    }
    public static void KadanesMaxSum(int arr[])
    {
        int max=Integer.MIN_VALUE,sum=0,csum=0;
        for(int i=0;i<arr.length;i++)
        {
            csum=csum+arr[i];
           if(csum<0)
           {
            csum=0;
           }
            max=Math.max(csum, max);
        }
        System.out.println("Maximum Sum is:"+max);
    }

    public static void main(String[] args) {
        // int arr[]=new int[10];
        // for(int i=0;i<=9;i++)
        // {
        // arr[i]=i;
        // }
        // for(int i=0;i<=9;i++)
        // {
        // System.out.println(arr[i]);
        // }
        // int arr[] = { 11, 22, 33, 44, 55 };
        // int j = BinSer(arr, 66);
        // if (j == -1) {
            // System.out.println("Element Not Present");
            // } else {
                // System.out.println("Element is Present at " + j);
                // }
                // // System.out.println(Largest(arr));
                // Revarr(arr);
                // for (int i = 0; i <= arr.length - 1; i++) {
                    // System.out.print(arr[i] + " ");
                    // }
                    // PairsArr(arr);
                    // SubArr(arr);
       int arr[] = { 1,-2,6,-1,3};
       prefixSum(arr); 
       KadanesMaxSum(arr);
    }
}
