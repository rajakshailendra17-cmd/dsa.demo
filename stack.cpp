// #include <iostream>

// class Stack
// {
// private:
//     // Structure representing a single node in the linked list
//     struct Node
//     {
//         int data;
//         Node *next;

//         Node(int value)
//         {
//             data = value;
//             next = nullptr;
//         }
//     };

//     Node *topNode; // Pointer to the top of the stack
//     int count;     // Keeps track of the stack size

// public:
//     // Constructor
//     Stack()
//     {
//         topNode = nullptr;
//         count = 0;
//     }

//     // Destructor to clean up memory and prevent memory leaks
//     ~Stack()
//     {
//         while (!isEmpty())
//         {
//             pop();
//         }
//     }

//     // O(1) Time: Insert an element at the beginning
//     void push(int value)
//     {
//         Node *newNode = new Node(value);
//         newNode->next = topNode;
//         topNode = newNode;
//         count++;
//     }

//     // O(1) Time: Remove and return the top element
//     int pop()
//     {
//         if (isEmpty())
//         {
//             std::cout << "Stack Underflow\n";
//             return -1; // Standard error sentinel value
//         }

//         Node *temp = topNode;
//         int poppedValue = temp->data;
//         topNode = topNode->next;

//         delete temp; // Free memory of the removed node
//         count--;

//         return poppedValue;
//     }

//     // O(1) Time: Return the top element without removing it
//     int peek()
//     {
//         if (isEmpty())
//         {
//             std::cout << "Stack is empty\n";
//             return -1;
//         }
//         return topNode->data;
//     }

//     // O(1) Time: Check if the stack is empty
//     bool isEmpty()
//     {
//         return topNode == nullptr;
//     }

//     // O(1) Time: Get the current size of the stack
//     int size()
//     {
//         return count;
//     }
// };

// // Driver code to test the implementation
// int main()
// {
//     Stack s;

//     s.push(10);
//     s.push(20);
//     s.push(30);

//     std::cout << "Top element is: " << s.peek() << "\n"; // Returns 30
//     std::cout << "Stack size is: " << s.size() << "\n";  // Returns 3

//     std::cout << s.pop() << " popped from stack\n";       // Returns 30
//     std::cout << "Top element now: " << s.peek() << "\n"; // Returns 20

//     return 0;
// }
#include <iostream>
using namespace std;
struct stack
{
    int size;
    int top;
    int *arr;
};
int isEmpty(struct stack *ptr)
{
    if (ptr->top == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
int isFull(struct stack *ptr)
{
    if (ptr->top == ptr->size - 1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
int main()
{
    struct stack *s = new stack();
    s->size = 80;
    s->top = -1;
    s->arr = new int[s->size];
    cout << "Stack has been created successfully\n";
    if (isEmpty(s))
    {
        cout << "Stack is empty\n";
    }
    else
    {
        cout << "Stack is not empty\n";
    }
    return 0;
}