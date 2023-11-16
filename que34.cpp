#include<iostream>
using namespace std;
class IntArray{
    int size;
    int *arr;
    public:
    IntArray(int s){
        size= s;
        arr = new int[size];
    }
   int& operator[] (int k){
    return arr[k];
   }
   friend void operator<<(ostream &os, IntArray &i){
    for(int a=0 ;a< i.size;a++){
        os<<i.arr[a]<<" ";
    }
   }

};
int main(){
    IntArray i(10);
    for(int k=0;k<10;k++){
       i[k] =k;
    }
     cout<<i;
    return 0;

}
