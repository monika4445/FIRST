#include <iostream>

int main()
{ 
    unsigned long long x;
    std::cin >> x;  //600851475143
    
    for (unsigned long long factor = 2; (factor * factor) <= x; factor++)
      while (x % factor == 0 && x != factor) // keeping last prime
        x /= factor;

    std::cout<< x <<std::endl;
  
  return 0;
}