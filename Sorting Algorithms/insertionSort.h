#pragma once
#include <vector>

void insertion_sort(std::vector<int>& data) {
	int i, j, tmp;
	for (i = 1; i < data.size(); i++)
	{
		j = i;
		tmp = data[i];
		while (j > 0 && tmp < data[j - 1]) {
			data[j] = data[j - 1];
			--j;
		}
		data[j] = tmp;

	}
}
