let arr=[12,23,34,54,64,65,75,786];
let val=54;
for(let i=0;i<arr.length;i++)
{
    if(arr[i]==val)
    {
        console.log(val+" is present at index:"+ i);
        break;
    }
}