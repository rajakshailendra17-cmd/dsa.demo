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
    void push_front(int val) // O(1)
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
    void push_back(int val) // O(1)
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
    void pop_front() // O(1)
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

    void pop_back() // O(n)

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
    void insert(int val, int pos) // O(n)
    {
        if (pos < 0)
        {
            cout << "invalid position" << endl;
            return;
        }
        else if (pos == 0)
        {
            push_front(val);
            return;
        }
        else
        {
            Node *temp = head;
            for (int i = 0; i < pos - 1; i++)
            {
                if (temp == NULL)
                {
                    cout << "invalid position" << endl;
                    return;
                }
                temp = temp->next;
            }
            Node *newNode = new Node(val);
            newNode->next = temp->next;
            temp->next = newNode;
        }
    }

    void printll() // O(n)
    {
        Node *temp = head;
        while (temp != NULL)
        {
            cout << temp->data << "-->";
            temp = temp->next;
        }
        cout << "NULL" << endl;
    }
    int search(int key) // O(n)
    {
        Node *temp = head;
        int pos = 0;
        while (temp != NULL)
        {
            if (temp->data == key)
            {
                return pos;
                break;
            }
            pos++;
            temp = temp->next;
        }
        return -1;
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

    l.printll();
    // l.insert(6, 1);
    // l.printll();
    cout << "enter a number to search"
         << endl;
    int key;
    cin >> key;
    int pos = l.search(key);
    if (pos == -1)
    {
        cout << "not found" << endl;
    }
    else
    {

        cout << "found at position " << pos << endl;
    }

    return 0;
}
