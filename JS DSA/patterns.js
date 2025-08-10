let n=10;
let ascii=65;
for(let i=1;i<=n;i++)
{
    for(let j=1;j<=i;j++)
    {
        process.stdout.write(String.fromCharCode(ascii)+" ");
        ascii++;
    }
    console.log();
}
console.log("--------------------------------------");
for(let i=1;i<=n-1;i++)
{
    for(let j=1;j<=2*n;j++)
    {
        if(i===j || i+j===2*n-1)
        {
            process.stdout.write("* ");
        }else{
            process.stdout.write("  ");
        }
    }
    console.log();
}