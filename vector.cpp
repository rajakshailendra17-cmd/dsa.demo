#include <stdio.h>
#include <vector>
int main()
{
    std::vector<int> vec;
    vec.push_back(10);
    printf("size of vector:%d", vec.size());
    // for (int i = 0; i < vec.size(); i++)
    // {
    //     std::printf("%d ", vec[i]);
    // }
    printf("\n%d", vec[0]);
    return 0;
}