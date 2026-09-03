// #include <stdio.h>
// void changearr(int marks[], int size)
//{
//  printf("in function\n");
// for (int i = 0; i < size; i++)
// {
//    marks[i] = 2 * marks[i];
//  }
//
// {
// int marks[] = {40, 50, 80, 90, 55, 65};
// int i, student[5], min, temp = 0, n, found = 0;
// changearr(marks, 6);
// printf("in main\n");
// for (i = 0; i < 6; i++)
// {
//   printf("%d\t", marks[i]);

// for (i = 0; i <= 5; i++)
// {
//     printf("%d\t", marks[i]);
// }
// printf("\nsize of marks in bytes:");
// printf("%d", sizeof(marks));
// printf("\nenter elements:");
// for (i = 0; i < 5; i++)
// {
//     scanf("%d", &student[i]);
// }
// printf("find the smallest number from the given array");
// min = marks[0];
// for (i = 1; i < 6; i++)
// {
//     if (min > marks[i])
//     {
//         temp = min;
//         min = marks[i];
//         marks[i] = temp;
//     }
// }
// printf("\nsmallest number is:%d", min);
// int smallest = marks[0];
// int largest = marks[0];
// for (i = 0; i < 6; i++)
// {
//  if (largest < marks[i])
//  {
//  largest = marks[i];
// }
// }
//  printf("largest number is:%d", largest);
//  printf("enter number to be searched:");
// scanf("\n%d", &n);
// for (i = 0; i < 6; i++)
//{
//  if (marks[i] == n)
//  {
//   found = 0;
//  break;
//  }
//}
// if (found == 0)
//{
// printf("number is found successfully! at the position");
// }
// else
// {
// printf("number is not found!");
// }
//}

#include <stdio.h>

// void lsearch(int arr[], int size)
//{
//     int found = 1, temp = -1, n;
//     printf("enter number to be search:");
//     scanf("%d", &n);

// for (int i = 0; i < size; i++)
//{
//  if (n == arr[i])
//{
//  found = 0;
// temp = i;
// break;
//}
//}

// if (found == 0)
//{
//   printf("number is found successfully at index %d", temp);
//}
// else
//{
//  printf("number is not found");
//}
//}

// void reverseArray(int arr[], int size)
// {
//     int start = 0;
//     int end = size - 1;

//     while (start < end)
//     {
//         int temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;
//         start++;
//         end--;
//     }
// }

int main(void)
{
    int arr[] = {10, 20, 30, 40, 50};
    // lsearch(arr, 5);
    reverseArray(arr, 5);
    printf("\nReversed array: ");
    for (int i = 0; i < 5; i++)
    {
        printf("%d ", arr[i]);
    }
    return 0;
}