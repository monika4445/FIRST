#pragma once
#include <vector>

int binary_search(std::vector<int> const& vec, int start, int end, const int target) {

	if (start > end) return -1;

	int mid = (start + end) / 2;
	if (target == vec[mid]) return mid;

	else if (target < vec[mid]) {
		return binary_search(vec, start, mid - 1, target);

	}

	return binary_search(vec, mid + 1, end, target);

}
