#include<iostream>
using namespace std;
int main()
{
    int a=100;
    if(a>0 && a<100)
    {
        cout<<"a is btw 0 and 100";
    }
    else if(a>0 || a<100)
    {
        cout<<" a is either greater than 0 or less than 100";
    }
    cout<<(a>5);
    return 0;
}