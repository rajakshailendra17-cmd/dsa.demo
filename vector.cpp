#include <stdio.h>
#include <vector>
// class Solution
// {
// public:
//     int singleNumber(std::vector<int> &vec)
//     {
//         int ans = 0;
//         for (int i = 0; i < vec.size(); i++)
//         {
//             ans = ans ^ vec[i];
//         }
//         return ans;
//     }
// };
// void linearsearch(std::vector<int> vec, int key)
// {
//     int found = 0;
//     for (int i = 0; i < vec.size(); i++)
//     {
//         if (vec[i] == key)
//         {
//             printf("\n%d is found at index %d", key, i);
//             found = 1;
//             break;
//         }
//     }
//     if (found == 0)
//     {
//         printf("\n%d is not found in vector", key);
//     }
// }
// void reverse(std::vector<int> &vec)
// {
//     int start = 0;
//     int end = vec.size() - 1;
//     while (start < end)
//     {
//         std::swap(vec[start], vec[end]);
//         start++;
//         end--;
//     }
// }
int main()
{
    std::vector<int> vec; // 0
    vec.push_back(1);
    vec.push_back(2);
    vec.push_back(4);
    vec.push_back(2);
    vec.push_back(1);
    vec.push_back(3);
    // vec.pop_back();
    // printf("size of vector:%d", vec.size());
    // for (int i = 0; i < vec.size(); i++)
    // {
    //     printf("\n%d ", vec[i]);
    // }
    // printf("\nfront value is:");
    // printf("%d", vec.front());
    // printf("\nend value is :");
    // printf("%d", vec.back());
    // printf("\ndisplay value of any index of vector:");
    // printf("\n%d", vec.at(2));
    // printf("\ncapacity of vector is:");
    // printf("%d", vec.capacity());
    // Solution sol;
    // int result = sol.singleNumber(vec);
    // printf("\nSingle number is: %d", result);
    // linearsearch(vec, 40);
    // reverse(vec);
    // printf("\nVector after reversing:");
    // for (int i = 0; i < vec.size(); i++)
    // {
    //     printf("\n%d ", vec[i]);
    // }
    for (int start = 0; start < vec.size(); start++)
    {
        for (int end = start; end < vec.size(); end++)
        {
            for (int i = start; i <= end; i++)
            {
                printf("%d", vec[i]);
            }
            printf(" ");
        }
        printf("\n");
    }

    return 0;
}