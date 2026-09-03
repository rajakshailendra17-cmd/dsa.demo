#include <stdio.h>
void main()
{
    int marks[] = {40, 50, 80, 90, 55, 65};
    int i, student[5], min, temp = 0;
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
    int smallest = marks[0];
    int largest = marks[0];
    for (i = 0; i < 6; i++)
    {
        if (largest < marks[i])
        {
            largest = marks[i];
        }
    }
    printf("largest number is:%d", largest);
}
