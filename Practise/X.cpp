#include<iostream>
using namespace std;
int fun(int *x)
{
    cout<<*x;
    *x=20;
    return 0;
}
int main()
{

    int x=10;
    fun(&x);
    // x=15;
    cout<<x;
    fun(&x);
    // int *p=&x;
    // cout<<"X:"<<x<<endl;
    // cout<<"p:"<<p<<endl;
    // cout<<"*p:"<<*p<<endl;
}