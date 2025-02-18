#include<iostream>
using namespace std;
class A{
    int a,b;
    public:
    void input(){
        cout<<"Enter values:";
        cin>>a>>b;
    }
    friend void add (A obj);
};
void add(A obj)
{
    int c;
    c= obj.a + obj.b;
    cout<<"sum"<<c;
}
int main()
{
    A obj1;
    obj1.input();
    add(obj1);
    return 0;
}