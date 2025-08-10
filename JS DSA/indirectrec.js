let money=200;
let apples=0;
let pc=15;
function buyApple(m)
{
    if(m>pc)
    {
        console.log("Remaining Money: ",m," Apples:",apples);
        buyMore(m);
    }else{
        console.log("No more money!! Total Apples Bought:",apples);
    }
}
function buyMore(m)
{
        apples++;
        buyApple(m-15)
}
buyApple(money);