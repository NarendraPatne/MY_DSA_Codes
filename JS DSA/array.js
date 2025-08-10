const arr=[]
const arr2=new Array();
const arr3=new Array(3)
const arr4=[23,23,23];
const arr5=new Array(34,344,5);
// ---------------------
// console.log(arr5);
const first=arr[0];
const len=arr.length;
const last=arr[len-1];
// -----------------------Operations from End
// Add element to the last  O(1)
arr.push(10);
arr.push(20);
arr.push(30);
// console.log(arr);
// Remove element from last O(1)
// console.log(arr.pop());
// console.log(arr.pop());
// console.log(arr);
// ----------------------Operations from Start
// Add element to the start O(n)
arr.unshift(11)
arr.unshift(12)
arr.unshift(14)
// console.log(arr);
// Remove element from last O(n)
// console.log(arr.shift());
// console.log(arr.shift());
// console.log(arr);
// ------------------------------------------
// Iterating over arrays
// 1] For loop
    // for(let i=0;i<arr.length;i++)
    // {
    //     console.log(arr[i]);
    // }
// while loop
    // let i=0;
    // while(i<arr.length)
    // {
    //     console.log(arr[i]);
    //     i++;
    // }
// forEach
// arr5.forEach((x,i)=>{
//     console.log(x);
// })
// for(let x of arr4)
// {
//     console.log(x);
// }
//  ---------------------------------------------
// Array Splice method
// Splice method directly works on main array rather than creating its copy
// 1] We can delete elements 2] Add Elements 3] Update elements in the array 
const a=[1,2,3,4,56,7,8];
// console.log(a)
// Deleting elements splice(startInd,noOfele)
 a.splice(1,2);
//  console.log(a)
 //  Adding Elements splice(start,noOfelD,...elem)
 a.splice(3,0,57,58);
//  console.log(a)
 //  Updating elements (Delete + Add) splice(startInd,noOfdel,...elem);
 a.splice(2,3,5,6);
//  console.log(a)
//  ---------------------------------------------
// Array Slice method
// Slice method returns new copy of array it doesnt work on main copy of array
// It gives us copy of subarray of main array
// slice(start,end+1)
//  console.log(a.slice(3,6));
//  main array remains same
//  console.log(a)
// ------------------------------------------------
 //   Shallow copy of Array: changes made to main array reflects in the second who is copy of it (Points to same memory address)
 const arrr=arr;
//  Deep Copy
// 1. Spread Operator
 const darr=[...arr];
//  2. 
const darrr=Array.from(arr5);
// ---------------------------------------------------
// Combining two arrays
const ab=[...arr,...arr2];
const ac=arr.concat(arr2);
// ---------------------------------------------------
// Check if two arr are equal
const isArrayEqual=(arr1,arr2)=>{
    // if(arr1.length!==arr2.length)
    //     return false;
    // for(let i=0;i<arr1.length;i++)
    // {
    //     if(arr1[i]!==arr2[i])
    //     {
    //         return false;
    //     }
    // }
    // return true;
    // arr.every method finds out the given condition is true or not 
    return arr1.length===arr2.length && arr1.every((e,i)=>{
        arr1[i]===arr2[i];
    })
}

// console.log(isArrayEqual(arr,darr));
// --------------------------------------------------------------------------
