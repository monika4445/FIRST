

let num = 6739;
if(((num + '').indexOf('3') > -1)){
console.log("YES");
}

if(num.toString().match(/5/) === null){ 
console.log("YES");
}

function hasIncreasingDigits(num) {

  let arrNum = ('' + num).split('');

  for (let i = 0; i < (arrNum.length - 1); i++) {
    if (parseInt(arrNum[i]) >= parseInt(arrNum[i + 1]))
      return false;
    }
  return true;
}

console.log(hasIncreasingDigits(num));
console.log(hasIncreasingDigits(1223));
console.log(hasIncreasingDigits(4569));






