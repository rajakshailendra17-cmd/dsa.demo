#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    // double X1, Y1, X2, Y2;
    // double distance;
    // cout << "Enter the coordinates of the first point (X1, Y1): ";
    // cin >> X1 >> Y1;
    // cout << "Enter the coordinates of the second point (X2, Y2): ";
    // cin >> X2 >> Y2;
    // distance = sqrt(pow(X2 - X1, 2) + pow(Y2 - Y1, 2));
    // cout << "The distance between the two points is: " << distance << endl;
    // return 0;
    // int n;
    // cout << "Enter any number: ";
    // cin >> n;
    // for (int i = 1; i <= n; i++)
    // {
    //     for (int j = 1; j <= i; j++)
    //     {
    //         if(j%i==0)
    //         {
    //             count++;
    //         }
    //  }
    // cout << endl;
    //}
    int p;
    float r, t, si;
    cout << "Enter principal amount: ";
    cin >> p;
    cout << "Enter rate of interest: ";
    cin >> r;
    cout << "Enter time in years: ";
    cin >> t;
    si = (p * r * t) / 100;
    cout << "Simple Interest = " << si << endl;
}