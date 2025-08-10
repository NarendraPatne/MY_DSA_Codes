let arr=[1,2,4,4,8,9,9,0];
function reverse(left,right)
{
    if(left==right || left>right) return;
    let t=arr[left];
    arr[left]=arr[right]
    arr[right]=t;
    left++;
    right--;
    reverse(left,right);
}
console.log(arr);
reverse(0,arr.length-1);
console.log(arr);