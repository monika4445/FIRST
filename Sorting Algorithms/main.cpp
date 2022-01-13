

#include <iostream>
#include <vector>

#include "bubbleSort.h"
#include "binarySearch.h"
#include "insertionSort.h"
#include "selectionSort.h"

void print_vec(std::vector <int> const& a);

int main()
{
	std::vector<int> vec1 = { 22, 33, 45, 6, 12, 3 };
	bubble_sort(vec1);
	std::cout << "Sorted vector using Bubble sort: " << std::endl;
	print_vec(vec1);

	std::cout << "Sorted vector using Insertion sort: " << std::endl;
	insertion_sort(vec1);
	print_vec(vec1);

	std::cout << "Sorted vector using Selection sort: " << std::endl;
	selection_sort(vec1);
	print_vec(vec1);

	std::vector<int> vec2 = { 32, 46, 78, 87, 88, 97, 124 };
	int target, index;
	std::cout << "Binary Search algorithm. Enter searching value " << std::endl;
	std::cin >> target;
    int start = 0, end = vec2.size() - 1;

	index = binary_search(vec2, start, end, target);
    if (index != -1)
	{
		std::cout << "Element found at index " << index << std::endl;
	}
	else std::cout << "Element not found. " << std::endl;

}

void print_vec(std::vector <int> const& a) {

	for (size_t i = 0; i < a.size(); i++)
	{
		std::cout << a.at(i) << " ";
	}
	std::cout << '\n' << std::endl;
}