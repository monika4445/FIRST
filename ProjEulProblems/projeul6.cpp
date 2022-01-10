#include <iostream>
#include <cmath>

int main()
{   int sumOfSquare = 0, squareOfSum = 0, sum = 0;
    for(int i = 1; i <= 100; ++i){
        sumOfSquare += pow(i, 2);
        
    }
    
    for(int i = 1; i <= 100; ++i){
        sum += i;
        
    }
    
   squareOfSum =  pow(sum, 2);
   int diff = squareOfSum - sumOfSquare;
   std::cout<< diff <<std::endl;
    
    return 0;
}