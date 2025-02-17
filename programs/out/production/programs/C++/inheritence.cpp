#include<iostream>
using namespace std;
class base{
    protected:
    int a,b;
    public:
    void input(){
        cout<<"Enter values";
        cin>>a>>b;
    }
};
class derive : public base{
private:
int m,n;
public:
void getdata(){
    cout<<"Enter values";
    cin>>m>>n;
}
void display(){
    cout<<"m:"<<m<<"  "<<"n:"<<n<<endl;
    cout<<"a:"<<a<<"  "<<"b:"<<b<<endl;
}
};
int main(){
    derive ob1;
    ob1.input();
    ob1.getdata();
    ob1.display();
}