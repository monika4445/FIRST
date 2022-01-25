
// C++ program for vector implementation of stack
#include <iostream>
#include <vector>

class Stack {
public:
    std::vector<int> m_vec;
    bool push(const int num);
    int pop();
    int peek();
    bool isEmpty();

};

bool Stack::push(const int num) {

    m_vec.push_back(num);
    std::cout << num << " pushed into Stack." << std::endl;
    return true;
}

int Stack::pop() {
    if (m_vec.empty()) {
        std::cout << "Stack Underflow." << std::endl;
        return 0;
    }

    int res = m_vec[m_vec.size() - 1];
    m_vec.pop_back();
    return res;

}

int Stack::peek() {

    if (m_vec.empty()) {
        std::cout << "Stack is empty. " << std::endl;
        return 0;
    }

    int res = m_vec.back();
    return res;

}

bool Stack::isEmpty() {

    return (m_vec.empty());

}

int main() {

    Stack obj1;

    int n = 88;
    obj1.push(n);
    obj1.push(22);
    obj1.push(7);
    obj1.push(15);
    std::cout << obj1.pop() << " Popped from Stack." << std::endl;

    while (!obj1.isEmpty()) {

        std::cout << obj1.peek() << " ";
        obj1.pop();

    }

    return 0;
}
