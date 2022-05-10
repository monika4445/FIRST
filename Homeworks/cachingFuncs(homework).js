function fib(index){
    return (index < 2) ? index : fib(index-1) + fib(index-2);
}

function multiply(a, b, c, d){
    return a * b * c * d;
}

function cachingfuncs(func){
const m = new Map();
    
    return function(arg){
    if(m.has(arg)){
        console.log('In memory.');
        return m.get(arg);
    }
        console.log('Calculating...');
        const res = func(arg);
        m.set(arg,res);
        return res;
    }
    
}

function cachMultiplyArgs(func){
const m = new Map();
    
    return function(...arg){
        let args = '';
    [...arg].forEach((v) => args += v);
    if(m.has(args)){
        console.log('In memory.');
        return m.get(args);
    }
        console.log('Calculating...');
        const res = func(...arg);
        m.set(args, res);
        return res;
    }
    
}

let obj = {
    
 cachMultiArgs(func){
const m = new Map();
    
    return function(){
        let args = '';
    [arguments].forEach((v) => args += v);
    if(m.has(args)){
        console.log('In memory.');
        return m.get(args);
    }
        console.log('Calculating...');
        const res = func.apply(this, arguments);
        m.set(args, res);
        return res;
    }
    
}

};

console.log('Caching function with one argument: ');
const cachingFib = cachingfuncs(fib);
cachingFib(8); cachingFib(8); console.log(cachingFib(8) + '\n');

console.log('Caching function with multiply arguments: ');
const cachingMultiply = cachMultiplyArgs(multiply);
cachingMultiply(2,2,5,2); cachingMultiply(2,2,5,2); console.log(cachingMultiply(2,2,5,2) + '\n');


console.log('Caching method of an object with multiply arguments: ');
const cachingMultiMethod = obj.cachMultiArgs(multiply);
cachingMultiMethod(2,2,5,2); cachingMultiMethod(2,2,5,2); console.log(cachingMultiMethod(2,2,5,2) + '\n');




