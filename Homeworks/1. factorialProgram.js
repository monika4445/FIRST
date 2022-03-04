function fact(n){
    if(n < 0) return -1;
    if(n === 0 || n === 1) return 1;
    for(var i = n - 1; i > 1; --i){
        n *= i;
    }
    return n;
}
let n = 6;
let factorial = fact(n);
console.log("The factorial of " + n + " is " + factorial);