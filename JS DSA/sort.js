// Sorting
const arr=[6,2,4,221,7,8,-23,-22];
// console.log(arr.sort((a,b)=>a-b))
// console.log(arr.sort((a,b)=>b-a))
// Sorting String
// const str="asdfjsdf";
// console.log(str.split("").sort().join(""));
// -------------------------------------------------------------------------
// Bubble Sort
const bubbleSort=(arr)=>{
    for(let i=0;i<arr.length;i++)
        {
        let swapped=false;
        for(let j=0;j<arr.length-i;j++)
        {
            if(arr[j]>arr[j+1]) 
            {
                // let t=arr[j];
                // arr[j]=arr[j+1];
                // arr[j+1]=t;
                [arr[j],arr[j+1]]=[arr[j+1],arr[j]]
                swapped=true;
            }
        }
        if(swapped==false)  break;
    }
}
console.log(arr);
bubbleSort(arr);
console.log(arr);
