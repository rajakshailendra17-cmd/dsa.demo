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
    // printf("\nfront value is:");
    // printf("%d", vec.front());
    // printf("\nend value is :");
    // printf("%d", vec.back());
    // printf("\ndisplay value of any index of vector:");
    // printf("\n%d", vec.at(2));
    printf("\ncapacity of vector is:");
    printf("%d", vec.capacity());
    return 0;
}