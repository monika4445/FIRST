#include <iostream> 
#include <cmath>  

bool  isPrime(int);

int main(){
   
   int limit = 10001;
   int count = 1; 
   int candidate = 1;
   
   while(count < limit) {
   candidate += 2; //add 2 because only 0 and 2 are even prime numbers, rest are odd 
   if(isPrime(candidate)){ count = count + 1;}  
}
    std::cout<< candidate <<std::endl;
    return 0;
}

bool  isPrime(int n){
int r;
if (n == 1) return false;
else if (n < 4) return true;
if(n % 2 == 0) return false;
else if(n < 9) return true;
else if(n % 3 == 0) return false;
else r = floor(sqrt(n));
int f = 5;
 while(f <= r){
if(n % f == 0) return false;
if(n % (f + 2) == 0) return false;
f = f + 6;
}
return true;
}