#include<iostream>
using namespace std;
int main(){
    int a,b,c;
    for(c=5;c>=0;c--){
        cout<<" ";
        for(a=1;a<=c;a++){
            cout<<"* ";
        }
        cout<<endl;
    }
}