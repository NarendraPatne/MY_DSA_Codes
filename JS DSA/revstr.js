let stack=[];
let size=stack.length;
function push(data)
{
    stack[size]=data;
    size++;
}
function pop()
{
    if(size==0)
    {
        console.log("Stack is Empty!");
        return;
    }
    let t=stack[size-1];
    size--;
    stack.length=size;
    return t;
}
function print()
{
    for(let a of stack)
    {
        process.stdout.write(a+" ");
    }
}
// ------------------------------
function reverseStr(str)
{
    for(let i=0;i<str.length;i++)
    {
        push(str[i]);
    }
    // print();
    for(let i=0;i<str.length;i++)
    {
        str[i]=pop();
    }
}
// ------------------------------
let str="Narendra";
str=str.split("");
console.log(str);
reverseStr(str);
console.log(str.join(""));