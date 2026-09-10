#include <iostream>
#include <cmath>
using namespace std;
struct Point
{
    double x;
    double y;
};
struct complex
{
    double real;
    double imag;
};

int main()
{
    complex c1, c2;
    cout << "Enter the real and imaginary parts of the first complex number: ";
    cin >> c1.real >> c1.imag;
    cout << "Enter the real and imaginary parts of the second complex number: ";
    cin >> c2.real >> c2.imag;
    complex sum;
    sum.real = c1.real + c2.real;
    sum.imag = c1.imag + c2.imag;
    cout << "The sum of the two complex numbers is: " << sum.real << " + " << sum.imag << "i" << endl;
    Point p1, p2;
    cout << "Enter the coordinates of the first point (X1, Y1): ";
    cin >> p1.x >> p1.y;
    cout << "Enter the coordinates of the second point (X2, Y2): ";
    cin >> p2.x >> p2.y;
    double distance = sqrt(pow(p2.x - p1.x, 2) + pow(p2.y - p1.y, 2));
    cout << "The distance between the two points is: " << distance << endl;
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
    // for (int i = 2; i <= n; i++)
    // {
    //     int count = 0;
    //     for (int j = 1; j <= i; j++)
    //     {
    //         if (i % j == 0)
    //         {
    //             count++;
    //         }
    //     }
    //     if (count == 2)
    //     {
    //         cout << i << " ";
    //     }
    // }
    //     for (int j = 1; j <= i; j++)
    //     {
    //         if(j%i==0)
    //         {
    //             count++;
    //         }
    //  }
    // cout << endl;
    //}
    //     int p;
    //     float r, t, si;
    //     cout << "Enter principal amount: ";
    //     cin >> p;
    //     cout << "Enter rate of interest: ";
    //     cin >> r;
    //     cout << "Enter time in years: ";
    //     cin >> t;
    //     si = (p * r * t) / 100;
    //     cout << "Simple Interest = " << si << endl;
}