#include<iostream>
using namespace std;
class Index{
    int i;
    public:
    Index(int i=0){
        this->i =i;
    }
    operator int(){
        return i;
    }
    int get_i(){
        return i;
    }
    int operator+ (Index &a){
        int t;
        t = i + a.i;
        return t;
    }
};

class Integer{
    int x;
    public:
    Integer(Index &ob){
        x=ob.get_i();
    }
    Integer( int x=0){
        this->x =x;
    }
};
 
int main(){
    Index in(4),out(10);
    int x = in;
    int y = in+out;
    in =2;
    Integer t;
    t =in;



}
