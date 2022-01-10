#include <iostream>

int main()
{   int answer = 0;
    int n = 2520;
    bool found = false;
    while (!found) {
        n += 2520;
        bool isDivisible = true;
        for (int j = 11; j <= 20; j++) {
           if (n % j != 0) {
              isDivisible = false;
              break;
           }
        }
        if (isDivisible) {
           found = true;
        }
     }
    
    answer = n;
    std::cout<< answer <<std::endl;
    
    return 0;
}