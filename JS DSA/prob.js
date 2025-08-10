function sumNat(num)
{
    return num*(num+1)/2;
}
// console.log(sumNat(5))
function sumDig(num)
{
    let sum=0;
    while(num>0)
    {
        let ld=num%10;
        sum=sum+ld;
        num=Math.floor(num/10);
    }
    return sum;
}
// console.log(sumDig(127))
function noDig(num)
{
    let count=0;
    if(num==0) return 1;
    num=Math.abs(num);
    while(num>0)
    {
       count++;
       num=Math.floor(num/10); 
    }
    return count;
}
console.log(noDig(31))