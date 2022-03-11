let realNums = [14.05, 8, 0, -87, 95, 0.25];
let max = Math.max(... realNums);
console.log("Maximum element in range is " + max + 
" and its index is " + realNums.indexOf(max) + ".(using built-in Math.max()");


function findMaxElem(realNums){
let maxElem = 0; let index = 0;
for(let i = 0; i < realNums.length; ++i){
    if(realNums[i] > maxElem){ maxElem = realNums[i]; index = i;}
}
console.log("Maximum element in range is " + maxElem + " and its index is " + index);
}

findMaxElem(realNums);








