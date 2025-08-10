class Stack{
    stack=[];
    size;
    max;
    constructor(s)
    {
        this.max=s;
        this.size=this.stack.length;
    }
    push(val)
    {
        if(this.size>=this.max)
        {
            console.log("Stack if full!!");
            return;
        }
        this.stack[this.size]=val;
        this.size++;
    }
    pop()
    {
        if(this.size==0)
        {
            console.log("Stack is Empty!!");
            return -1;
        }
        let t=this.stack[this.size-1];
        this.size--;
        this.stack.length=this.size;
        return t;
    }
    peek()
    {
        console.log(this.stack[this.size-1]);
    }
    display()
    {
        console.log(this.stack);
    }
}
// -------------------------
st=new Stack(5);
st.push(10);
st.push(20);
st.push(30);
st.push(40);
st.display();
console.log(st.size)
st.pop();
st.display();
console.log(st.size)
st.peek();