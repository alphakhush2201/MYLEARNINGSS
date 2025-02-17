#include<iostream>
using namespace std;
class a{
    public :
    int x,y;
    void getdata(){
        cout<<"Enter the values:";
        cin>>x>>y;
        
    }
};
class b: public a{
    public:
    void product(){
        cout<<"Product:"<<x*y<<endl;
    }
};
class c: public a{
    public:
    void sum(){
        cout<<"Sum"<<x+y;
    }
};
int main(){
    a obj;
    b obj1;
    c obj2;
    obj.getdata();
    obj1.product();
    obj.getdata();
    obj2.sum();
    return 0;
}