
/* C++ program for array implementation of stack
   Advantage: Easy to implement. Memory and resources are saved as pointers are not involved. 
   Disadvantage: It is not dynamic. It doesn’t grow and shrink depending on needs at runtime.
*/
#include <iostream>

const int max = 1000;

class Stack {
public:
    int m_arr[max];
    Stack() { m_top = -1; }
    bool push(const int num);
    int pop();
    int peek();
    bool isEmpty();

private:
    int m_top;
};

bool Stack::push(const int num) {

    if (m_top >= (max - 1)) {
        std::cout << "Stack Overflow." << std::endl;
        return false;
    }
    m_arr[++m_top] = num;
    std::cout << num << " pushed into Stack." << std::endl;
    return true;
}

int Stack::pop() {
    if (m_top < 0) {
        std::cout << "Stack Underflow." << std::endl;
        return 0;
    }

    int res = m_arr[m_top--];
    return res;

}

int Stack::peek() {

    if (m_top < 0) {
        std::cout << "Stack is empty. " << std::endl;
        return 0;
    }

    int res = m_arr[m_top];
    return res;

}

bool Stack::isEmpty() {

    return (m_top < 0);

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