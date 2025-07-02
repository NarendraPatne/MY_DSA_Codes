#include<iostream>
using namespace std;
int main()
{
    int a=10;
    int b=a++;
    cout<<"a="<<a;
    cout<<"b="<<b;
    int c=++a;
    cout<<"c="<<c<<endl;
    cout<<"a="<<a;
    cout<<"c="<<c++;
    cout<<"c="<<++c;
}