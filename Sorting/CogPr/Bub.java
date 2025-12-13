import java.util.Arrays;

public class Bub {
    static void BubbleSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    flag=1;
                }
            }
            if(flag==0) return;
        }
    }
    static void SelectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minIdx=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIdx])
                {
                    minIdx=j;
                }
            }
            int t=arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=t;
        }
    }
    static void InsertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    static void Insertion(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
            int arr[]={6,5,3,2,245,6,7,8,4,3,2,32};
            Insertion(arr);
            System.out.println(Arrays.toString(arr));
    }   
}