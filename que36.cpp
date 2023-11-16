#include<iostream>
using namespace std;
class Table{
    int row;
    int col;
    int **arr;
    public:
    Table(int r,int c){
        row=r;
        col =c;
        for(int a=0 ;a<row;a++){
            arr[a] = new int[col];
        }
    }
   int* &operator[](int index){
    return arr[index];
   }
   friend void operator<<(ostream &os, Table &t){
    for(int a=0 ;a< t.row;a++){
         for(int b=0 ;b<t.col;b++){
            os<<t.arr[a][b];
         }
    }
   }
   friend void operator>>(istream &is, Table &t){
    cout<<"enter values";
    for(int a=0 ;a< t.row;a++){
         for(int b=0 ;b<t.col;b++){
            is>>t.arr[a][b];
         }
    }
   }


};
int main(){
    Table t(4,5),t1(4,5);
    cin>>t;
    cin >>t1;
    t[0][0] =5;
    int x = t[2][3];
    cout<<t;
    return 0;

}
