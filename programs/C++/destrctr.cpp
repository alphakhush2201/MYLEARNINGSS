#include<iostream>
using namespace std;
class test{
    int n;
    public:
    test(){
        n=10;
        cout<<n<<endl;
    }
    ~test(){
        cout<<"Object destroyed:";
    }
};
int main(){
    test ob;
}
