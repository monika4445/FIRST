function swap(arr) {
    [arr[0], arr[arr.length - 1]] = [arr[arr.length - 1], arr[0]];
    return arr;
}
let numArr = [8,5,4,7];

console.log(swap([1,2,3,4])); 
console.log(swap(numArr));  
console.log(swap([0, 2, 1]));  
console.log(swap([55]));  




