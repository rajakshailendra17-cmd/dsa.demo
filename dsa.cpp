#include <iostream>
#include <math.h>
using namespace std;

// int main()
// {

// int temp = n, rem = 0, bin = 0, i=0;
//     while(temp != 0){
//         rem = temp % 2;
//         bin = (pow(10, i) * rem) + bin;
//         i++;
//         temp/= 2;
//     }

// #include <iostream>
//  #include <cmath>
//  using namespace std;
//  class rectangle
//  {
//  public:
//      int length, breadth;
//      rectangle()
//      {
//          cout << "hello" << endl;
//      }

//     rectangle(int l, int b)
//     {
//         length = l;
//         breadth = b;
//         // cout << "hello" << endl;
//         cout << "lenght=" << length << endl;
//         cout << "breadth=" << breadth << endl;
//     }
//     int area()
//     {
//         return length * breadth;
//     }
// };
// int main()
// {
//     rectangle r(2, 5);
//     rectangle r1;
//     cout << r.area() << endl;
// }
// features of the default contsructor:
// the name of the constructor should be same as the class name
//  a constructor do not have any return type
//  a default constructor which is provided by cpp is invisible.
//  if we create a defualt constructor manualy the cpp takes away it's inbuilt constructor.
//  struct complex
//  {
//      double real;
//      double imag;
//      void init(double r, double i)
//      {
//          real = r;
//          imag = i;
//      }
//      void display()
//      {
//          if (imag >= 0)
//          {
//              cout << real << "+i" << imag << endl;
//          }
//          else
//          {
//              cout << real << "-i" << imag * (-1) << endl;
//          }
//      }
//  };

// int main()
// {
//     double a, b;
//     complex c;
//     cout << "Enter the real and imaginary parts of the complex number: ";
//     cin >> a >> b;
//     c.init(a, b);
//     c.display();
//     return 0;
// }

// complex c1, c2;
// cout << "Enter the real and imaginary parts of the first complex number: ";
// cin >> c1.real >> c1.imag;
// cout << "Enter the real and imaginary parts of the second complex number: ";
// cin >> c2.real >> c2.imag;
// complex sum;
// sum.real = c1.real + c2.real;
// sum.imag = c1.imag + c2.imag;
// cout << "The sum of the two complex numbers is: " << sum.real << " + " << sum.imag << "i" << endl;
// Point p1, p2;
// cout << "Enter the coordinates of the first point (X1, Y1): ";
// cin >> p1.x >> p1.y;
// cout << "Enter the coordinates of the second point (X2, Y2): ";
// cin >> p2.x >> p2.y;
// double distance = sqrt(pow(p2.x - p1.x, 2) + pow(p2.y - p1.y, 2));
// cout << "The distance between the two points is: " << distance << endl;
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

//  STORE THE DATA OF STUDENTS USING CLASS AND OBJECTS
// #include <iostream>
// using namespace std;

// class Student
// {
// public:
//     int rollNo;
//     string name;
//     float marks;

//     void getData()
//     {
//         cout << "Enter Roll Number: ";
//         cin >> rollNo;

//         cout << "Enter Name: ";
//         cin >> name;

//         cout << "Enter Marks: ";
//         cin >> marks;
//     }

//     void displayData()
//     {
//         cout << "\nStudent Details";
//         cout << "\nRoll Number: " << rollNo;
//         cout << "\nName: " << name;
//         cout << "\nMarks: " << marks;
//     }
// };

// int main()
// {
//     Student s1;

//     s1.getData();
//     s1.displayData();

//     return 0;
// }

// SHOW THE FUNCTION OF MODEL OF A CAR
// #include <iostream>
// using namespace std;

// class Car
// {
// private:
//     int speed;
//     string model;

// protected:
//     float fuelLevel;

// public:
//     void setData(int s, string m, float f)
//     {
//         speed = s;
//         model = m;
//         fuelLevel = f;
//     }

//     int getSpeed()
//     {
//         return speed;
//     }

//     string getModel()
//     {
//         return model;
//     }

//     float getFuelLevel()
//     {
//         return fuelLevel;
//     }
// };

// class SportsCar : public Car
// {
// public:
//     void showFuel()
//     {
//         cout << "\nFuel Level: " << fuelLevel;
//     }
// };

// int main()
// {
//     SportsCar c;

//     c.setData(120, "BMW", 50);

//     cout << "Car Details";
//     cout << "\nSpeed: " << c.getSpeed();
//     cout << "\nModel: " << c.getModel();

//     c.showFuel();

//     return 0;
// }

// make a program to demonstrate the account.
#include <iostream>
using namespace std;

class Account
{
private:
    int accountNumber;
    double balance;
    string accountHolderName;

public:
    // Constructor
    Account(int accNo, string name, double bal)
    {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    // Deposit money
    void deposit(double amount)
    {
        if (amount > 0)
        {
            balance = balance + amount;
            cout << "\nAmount Deposited Successfully";
        }
        else
        {
            cout << "\nInvalid Amount";
        }
    }

    // Withdraw money
    void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance = balance - amount;
            cout << "\nAmount Withdrawn Successfully";
        }
        else
        {
            cout << "\nInsufficient Balance or Invalid Amount";
        }
    }

    // Display account details
    void display()
    {
        cout << "\nAccount Number: " << accountNumber;
        cout << "\nAccount Holder: " << accountHolderName;
        cout << "\nBalance: " << balance;
    }
};

int main()
{
    Account a1(101, "Rahul", 5000);

    a1.display();

    a1.deposit(2000);

    a1.withdraw(1000);

    cout << "\n\nUpdated Account Details";

    a1.display();

    return 0;
}