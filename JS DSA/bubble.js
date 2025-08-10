let arr=[78,23,65,23,7,246,6];
for(i=0;i<arr.length;i++)
{
    for(j=0;j<arr.length-i;j++)
    {
        if(arr[j]>arr[j+1])
        {
            let t=arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=t;
        }
    }
}
console.log(arr);