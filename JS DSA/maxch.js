let str="osisdffnqefooo";
let obj={}
let max=''
for(let i=0;i<str.length;i++)
{
    let key=str[i];
    if(!obj[key])
    {
        obj[key]=0;
    }
    obj[key]++;
    if(max=='' || obj[key]>obj[max])
    {
        max=key;
    }
}
console.log(max,obj[max]);