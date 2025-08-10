// Objects in JS
const person={
    name:"Vladimir",
    age:21,
    isAdult:true,
    skills:["adf","adf","asdf"],
    projects:{
        Frontend:"Tailwind",
        backend:"Java"
    },
    code:function()
    {
        return "Do code on yourself not AI!!.";
    },
    work:()=>{
        return "Work using your own brain.";
    }
}
// console.log(person)
// console.log(person.name)
// console.log(person.age)
// console.log(person.skills)
// console.log(person["projects"])
// console.log(person["work"])
// console.log(person.code())
// console.log(person.work())
// How to check key exist in object
// console.log(person.hasOwnProperty("name"))
// console.log(person.hasOwnProperty("code"))
// Add new key
person.address="Pune";
// console.log(person)
// Update
person.age=35;
// console.log(person)
// Delete
delete person.work
// console.log(person)
// ---------------------------------------------------------------------
// Shallow copy of objects
// Points to main object (Reference to the same object)
// change in main object reflects in copy also 
const person2=person;
// console.log(person2)
person.x=23
// console.log(person2)

//---------- Deep Copy (but shallow copy of nested objects)
const person3=Object.assign({},person); //creates new empty object copies the contents of main obj to it and returns
person.y=35;
// console.log(person);
// console.log(person3);
// --------------------------------------------------------------------------- Object Methods
// Freeze() You cant add/update/delete object keys and values
Object.freeze(person3);
// console.log(person3);
person3.sdf=243;
person3.age=23;
person3.adk=" assdfaf";
// console.log(person3); //No change
// console.log(Object.isFrozen(person3))
// Object.seal() You cant add/update/delete object keys but can update values
Object.seal(person2);
// console.log(person3);
console.log("-----------------------")
person3.name="adf"
person3.as=23;
person3.isAdult=false;
// console.log(person3);
// ---------------------------------------------------
console.log(Object.keys(person3));
// Itetrate 
// for in 
for(let key in person3)
{
    console.log(key,":",person3[key]);
}
console.log("--------------------------")
Object.keys(person3).forEach((key)=>console.log(key,":",person3[key]));
// -------------------------------------------------------
// Compare Objects
console.log(Object.is(person2,person));
for(let key in person)
{
    if(person[key]!==person2[key])
        console.log(false);
}

