let stack=[];
let size=stack.length;
let max=5;
function push(data)
{
    if(size==max)
    {
        console.log("Stack is full!!");
        return;
    }
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
print();
push(91);
push(92);
push(93);
push(90);
print();
console.log(pop());

print();