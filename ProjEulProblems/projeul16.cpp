#include <iostream> 

int main(){
 
	int array[500]; 
	int sum = 0; 
	array[0] = 1; 
	
	/* initialize an integer array of size greater than
	a bound on number of digits in 2^1000 with all zeros. */
	for(int j = 1; j < 500; ++j) 
	{	array[j] = 0;  }
		
	for(int i = 1; i < 1001; ++i) 
	{ 
		array[0] = 2 * array[0]; 
		
		for(int k = 1; k < 500; ++k) 
		{ array[k] = 2 * array[k] + array[k-1] / 10; }
			
		for(int j = 0; j < 500; ++j) 
        { array[j] = array[j] % 10; } //keep the last digit in the array
	} 
	
	for(int i = 0; i < 500; i++) 
	{ sum += array[i]; }
	std::cout<< "The sum of the digits of the number 2^1000 is " << sum; 
	
    return 0;
}