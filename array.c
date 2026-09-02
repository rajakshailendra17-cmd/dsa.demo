#include <stdio.h>
void main()
{
    int marks[] = {40, 50, 80, 90, 55, 65};
    int i;
    for (i = 0; i <= 5; i++)
    {
        printf("%d\t", marks[i]);
    }
    printf("\nsize of marks in bytes:");
    printf("%d", sizeof(marks));
}
