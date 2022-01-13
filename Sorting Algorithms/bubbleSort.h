#pragma once
#include <vector> 
#include "swap_f.h"

void bubble_sort(std::vector <int>& v1) {
	for (size_t i = 0; i < v1.size() - 1; ++i)
	{
		bool isSwapped = false;
		for (size_t k = 0; k < v1.size() - i - 1; ++k)
		{
			if (v1[k] > v1[k + 1])
			{
				swap_f(v1[k], v1[k + 1]);
				isSwapped = true;
			}

		}
		if (isSwapped) {
			break;
		}
	}
}