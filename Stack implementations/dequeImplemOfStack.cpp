//C++ Program for deque implementation of Stack
#include <iostream>
#include <stack>

template<typename T> void m_swap(T& t1, T& t2);

class Stack {
public:
    std::deque<int> m_deq;
    bool push(const int num);
    int pop();
    int top();
    bool empty();
    int size();
    void swap(Stack* other) noexcept;

};

int main() {

    Stack s1, s2, s3;
    s2.push(67);
    s2.push(44);
    s1.push(27);
    s1.push(66);
    s1.push(19);
    std::cout << s1.pop() << " Popped from Stack." << std::endl;

    std::cout << "Elements of Stack s1: ";
    while (!s1.empty()) {
        std::cout << s1.top() << " ";
        s1.pop();
    }
    s1 = s2;
    std::cout << '\n' << "Stack s1 size is " << s1.size() << std::endl;
    s3.push(31);
    s3.push(8);

    s2.swap(&s3);
    std::cout << "\nThe Content of Stack s3 after swapping: " << std::endl;
    while (!s3.empty()) {
        std::cout << s3.top() << " ";
        s3.pop();
    }

    std::cout << "\nThe Content of Stack s2 after swapping: " << std::endl;
    while (!s2.empty()) {
        std::cout << s2.top() << " ";
        s2.pop();
    }

    return 0;
}

bool Stack::push(const int num) {

    m_deq.push_back(num);
    std::cout << num << " pushed into Stack." << std::endl;
    return true;
}

int Stack::pop() {

    if (m_deq.empty()) {
        std::cout << "Stack Underflow." << std::endl;
        return 0;
    }

    int res = m_deq[m_deq.size() - 1];
    m_deq.pop_back();
    return res;

}

int Stack::top() {

    if (m_deq.empty()) {
        std::cout << "Stack is empty. " << std::endl;
        return 0;
    }

    int res = m_deq.back();
    return res;

}

bool Stack::empty() {
    return (m_deq.empty());
}

int Stack::size() {
    return  m_deq.size();
}

template<typename T>
void m_swap(T& t1, T& t2) {
    T temp = std::move(t1);
    t1 = std::move(t2);
    t2 = std::move(temp);
}

void Stack::swap(Stack* other) noexcept {
    m_swap(this->m_deq, other->m_deq);
}

