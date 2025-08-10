// String collection of characters
let firstName="Narendra";
console.log(firstName)
// ----------------------------------------
// String methods
console.log(firstName.length)
console.log(firstName.charAt(1))
console.log(firstName.charCodeAt(1))
// check if "" is present in string
console.log(firstName.includes("n"))
console.log(firstName.indexOf("dra")) //returns first index
console.log(firstName.lastIndexOf("a")) //returns last index
console.log(firstName.localeCompare("f"));
const str="Vishal is Sigma male.Vishal Vishal";
console.log(str.replace("Vishal","Rohan")); //Replace only first occurance returns copy 
console.log(str.replaceAll("Vishal","Rohan")) //Replace all occurances returns copy
console.log(str.substring(9,15))
console.log(str)
// Split divides string into array
const strar=str.split(" ");
console.log(strar)
// join joins array into single string
console.log(strar.join(" "))
console.log(str.startsWith("Vishal"))
console.log(str.endsWith("ishal"))
const strr="adf   "
console.log(strr.trim()) //trimStart() trimEnd()
console.log(strr.toUpperCase());
console.log(strr.toLowerCase())
const n=234234;
console.log(n)
console.log(n.toString())