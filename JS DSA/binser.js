let arr=[3,4,5,6,7,8,9,10];
const binarySearch=(arr,key)=>{
    let start=0,end=arr.length-1;
    while(start<=end)
    {
        let mid=Math.floor((start+end)/2);
        if(arr[mid]==key)
        {
            return mid;
        }else if(arr[mid]>key)
        {
            end=mid-1;
        }else{
            start=mid+1;
        }
    }
    return -1;
}
console.log(binarySearch(arr,11))
console.log(Math.ceil(9))