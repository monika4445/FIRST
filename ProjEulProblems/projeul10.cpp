#include <iostream>
#include <cmath>

bool isPrime(const int&);

int main()
{   
    long int limit = 2000000;
    long int sum = 2;

	for(int i = 3; i < limit; i += 2)
	{
		if (isPrime(i))
			sum += i;
	}

	std::cout << "The sum of all the primes below two million is " << sum << std::endl;

	return 0;

}

bool isPrime(const int& number)
{
	 bool isPrimeFlag = true;
	 const int square = sqrt(number);
	for(int i = 2; i <= square; ++i)
	{
		if(number % i == 0)
		{
		isPrimeFlag = false;
        break; 
		}
	}

	return isPrimeFlag;
}
