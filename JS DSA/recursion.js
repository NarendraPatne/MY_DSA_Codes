let arr=[16,23,64,24,64,23,6,5];
function printRec(i)
{
    if(i==arr.length)  return;
    printRec(i+1);
    process.stdout.write(arr[i]+" ");
}
printRec(0);
function factorial(num)
{
    if(num==1) return 1;
    let res=num*factorial(num-1);
    return res;
}
console.log(factorial(5));
