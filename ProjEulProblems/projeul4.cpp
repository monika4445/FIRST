#include <iostream>

static int isPal(int);

int main(){

    int largestPal = -1, big1 = 0, big2 = 0;

    for (int n1 = 100; n1 < 1000; ++n1) {
        int prod = 99 * n1;
        for (int n2 = 100; n2 < 1000; ++n2) {
            prod += n1;

           // Don't call function for checking for palindrome if product is not greater(This allows &&)
          if (prod > largestPal && isPal(prod)) {
                big1 = n1;
                big2 = n2;
                largestPal = prod;
            }
        }
    }
    
  std::cout<< big1 << " x " << big2 << " = " << largestPal <<std::endl;
    return 0;
}

static int isPal(int num) {
    // Use temporary to create reversed value.
    int test = num, rev = 0;
    while (test > 0) {
        rev = rev * 10 + (test % 10);
        test /= 10;
    }
    return rev == num;
}
