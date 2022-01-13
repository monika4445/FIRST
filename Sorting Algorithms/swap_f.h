#pragma once
template <typename T>
void swap_f(T& a, T& b) {
	T tmp;

	tmp = a;
	a = b;
	b = tmp;
}
