let amount = 4788;
if (amount >= 500) {
  console.log("500 Notes :",Math.trunc(amount / 500));
  amount %= 500;
}
if (amount >= 200) {
  console.log("200 Notes :",Math.trunc(amount / 200));
  amount %= 200;
}
if (amount >= 100) {
  console.log("100 Notes :",Math.trunc(amount / 100));
  amount %= 100;
}
if (amount >= 50) {
  console.log("50 Notes :",Math.trunc(amount / 50));
  amount %= 50;
}
if (amount >= 20) {
  console.log("20 Notes :",Math.trunc(amount / 20));
  amount %= 20;
}
if (amount >= 10) {
  console.log("10 Notes :",Math.trunc(amount / 10));
  amount %= 10;
}
if (amount >= 5) {
  console.log("5 Notes :",Math.trunc(amount / 5));
  amount %= 5;
}
if (amount >= 2) {
  console.log("2 Notes :",Math.trunc(amount / 2));
  amount %= 2;
}
if (amount === 1) {
  console.log("1 Coins",amount);
}
