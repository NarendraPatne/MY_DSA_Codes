const arr=[5,6,4,3,5,67,2,8,8,9];
// console.log(arr);
// arr.sort();
// console.log(arr);
// arr.reverse();
// console.log(arr);
// ---------------------------------------------
// map takes callback fun and runs it for each element of the array and return new array keeps main array same
const narr=arr.map((e,i)=>{
    return e+5;
})

console.log(arr)
console.log(narr)
// filter runs callback function on all the elements in array and returns only the elements that satisfy the condition
const earr=arr.filter((e,i)=>e%2==0);
console.log(earr);
// reduce used to reduce array to one value by operating over all the elements in array
const sarr=arr.reduce((acc,e)=>acc+e,0)
console.log(sarr);
// flat(depth)
const e=[1,2,4,[22,42,4,56],[23,[23,[34]]]];
console.log(e);
console.log(e.flat(4));
// filter vs find
// filter returns all the elements in the array that satisfy the condition 
// whereas find returns only the first element that satisfy the condition
console.log(e.flat(4).filter((e)=>e%2==0))