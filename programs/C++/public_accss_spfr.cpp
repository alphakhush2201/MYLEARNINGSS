#include<iostream>
using namespace std;
class sample
{
    public:
    int age;
    void display()
    {
        cout<<"Age:"<<age;
    }
};
int main()
{
    sample obj;
    cout<<"Enter your age:";
    cin>>obj.age;
    obj.display();
}
