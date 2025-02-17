#include <iostream>
using namespace std;
class A{
public:
virtual void show(){
    cout<<"\n Base class";
}
};
class B: public A{
    public:
    void show(){
        cout<<"\n derived class";
    }
};
int main(){
    A *bptr;
    B *bptr1;
    A obj;
    B obj1;
    bptr = &obj;
    bptr1 = &obj1;
    bptr->show();
    bptr1->show();
    return 0;
}