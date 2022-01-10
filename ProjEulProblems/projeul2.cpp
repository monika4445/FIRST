#include <iostream>

int evenFibSum(int);

int main()
{
     int limit = 4000000;
     std::cout<< evenFibSum(limit) <<std::endl;

    return 0;
}

int evenFibSum(int limit)
{
    if (limit < 2)
        return 0;

    // Initialize first two even prime numbers and their sum
    long long int even1 = 0, even2 = 2;
    long long int sum = even1 + even2;

    // calculate sum of even Fibonacci value
    while (even2 <= limit)
    {
        // get next even value
        long long int even3 = 4 * even2 + even1;
         // If we go beyond limit, we break loop
        if (even3 > limit)
            break;

        // Move to next even number and update sum
        even1 = even2;
        even2 = even3;
        sum += even2;
    }
    
    return sum;
}