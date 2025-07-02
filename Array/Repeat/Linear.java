
public class Linear {
    public static int linearS(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int key=80;
        int y=linearS(arr, key);
        if(y==-1)
        {
            System.out.print(key+" is not Present in the Array");
        }
        else{
            System.out.println(key+" is Present at "+y+" index in Array");
        }
    }
}
