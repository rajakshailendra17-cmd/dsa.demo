#include <stdio.h>
#include <vector>
int main()
{
    std::vector<int> vec;
    vec.push_back(10);
    vec.push_back(20);
    vec.push_back(40);
    vec.push_back(50);
    vec.push_back(60);
    vec.pop_back();
    printf("size of vector:%d", vec.size());
    for (int i = 0; i < vec.size(); i++)
    {
        printf("\n%d ", vec[i]);
    }

    return 0;
}