
#include <iostream>
#include <vector>

int main() {

    std::vector<int> vec{ 12, 34, 66, 3, 8, 76 };
    vec.push_back(24);

    std::vector<int>::iterator iter;
    std::cout << "Vector elements are: ";
    for (iter = vec.begin(); iter != vec.end(); ++iter) {
        std::cout << *iter << " ";
    }

    return 0;
}
