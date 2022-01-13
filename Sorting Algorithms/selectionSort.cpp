#include <vector>
#include "swap_f.h"

void selection_sort(std::vector <int>& v1) {
	size_t minIndex;
	for (size_t i = 0; i < v1.size() - 1; ++i) {
		minIndex = i;
		for (size_t j = 0; j < v1.size(); j++)
		{
			if (v1[j] < v1[minIndex])
			{
				minIndex = j;
			}

		}
		swap_f(v1[minIndex], v1[i]);
	}
}