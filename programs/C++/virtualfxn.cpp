#include<iostream>
using namespace std;
class A{
    public:
    void show(){
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
    A obj1;
    obj1.show();
    B obj;
    obj.show();
    
    return 0;
}