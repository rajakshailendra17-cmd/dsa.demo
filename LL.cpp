#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next; // pointer to next node
    Node(int val)
    {
        data = val;
        next = NULL; // initially next pointer is pointing to NULL
    }
};
class list
{
    Node *head;
    Node *tail;

public:
    list()
    {
        head = tail = NULL;
    }
    void push_front(int val)
    {
        Node *new_node = new Node(val);
        if (head == NULL)
        {
            head = tail = new_node;
            return;
        }
        else
        {
            new_node->next = head;
            head = new_node;
        }
    }
    void push_back(int val)
    {
        Node *new_node = new Node(val);
        if (head == NULL)
        {
            head = tail = new_node;
        }
        else
        {
            tail->next = new_node;
            tail = new_node;
        }
    }
    void pop_front()
    {
        if (head == NULL)
        {
            return;
        }
        else if (head == tail)
        {
            head = tail = NULL;
        }
        else
        {
            Node *temp = head;
            head = head->next;
            temp->next = NULL;
            delete temp;
        }
    }

    void pop_back()
    {
        if (head == NULL)
        {
            cout << "empty linked list" << endl;
            return;
        }
        else if (head == tail) // only one node
        {
            delete head;
            head = tail = NULL;
            return;
        }
        Node *temp = head;
        while (temp->next != tail) // stop at second-last
        {
            temp = temp->next;
        }
        delete tail;       // delete last node
        tail = temp;       // update tail
        tail->next = NULL; // mark end of list
    }

    void printll()
    {
        Node *temp = head;
        while (temp != NULL)
        {
            cout << temp->data << "-->";
            temp = temp->next;
        }
        cout << "NULL" << endl;
    }
};
int main()
{
    list l;
    l.push_front(1);
    l.push_front(2);
    l.push_front(3);
    l.push_front(4);
    l.push_back(5);
    l.pop_front();

    l.printll();
    l.pop_back();
    l.printll();

    return 0;
}
