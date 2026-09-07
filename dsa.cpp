#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    double X1, Y1, X2, Y2;
    double distance;
    cout << "Enter the coordinates of the first point (X1, Y1): ";
    cin >> X1 >> Y1;
    cout << "Enter the coordinates of the second point (X2, Y2): ";
    cin >> X2 >> Y2;
    distance = sqrt(pow(X2 - X1, 2) + pow(Y2 - Y1, 2));
    cout << "The distance between the two points is: " << distance << endl;
    return 0;
}