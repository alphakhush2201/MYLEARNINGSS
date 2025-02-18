#include<iostream>
using namespace std;
int main(){
int arr[4];
cout<<"Enter three no.s:";
cin>>arr[0]>>arr[1]>>arr[2];
arr[3]=(arr[0]+arr[1]+arr[2])/3;
cout<<"The average of three no.s is:"<<arr[3];
}