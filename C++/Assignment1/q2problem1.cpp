#include <iostream>
using namespace std;

void resetSensorPairV1(int r1, int r2){
    cout<<"--- V1: Call by value ---"<<endl;
    cout<<"Before : "<<"A = "<<r1<<"\tB = "<<r2<<endl;
    int t = r1;
        r1 = r2;
        r2 = t;
    }

void resetSensorPairV2(int &r1, int &r2){
    cout<<"--- V2: Call by reference ---"<<endl;
    cout<<"Before : "<<"A = "<<r1<<"\tB = "<<r2<<endl;
    int t = r1;
        r1 = r2;
        r2 = t;
    }

void resetSensorPairV3(int *r1, int *r2){
    cout<<"--- V3: Call by pointer ---"<<endl;
    cout<<"Before : "<<"A = "<<*r1<<"\tB = "<<*r2<<endl;
    int t = *r1;
        *r1 = *r2;
        *r2 = t;
    cout<<"After : "<<"A = "<<*r1<<"\tB = "<<*r2<<"\t<--values swapped back"<<endl;
}

int main(){
    int A = 55;
    int B = 12;
     
    resetSensorPairV1(A,B);
    cout<<"After : "<<"A = "<<A<<"\tB = "<<B<<"\t<--values unchanged"<<endl; 
    resetSensorPairV2(A,B);
    cout<<"After : "<<"A = "<<A<<"\tB = "<<B<<"\t<--values swapped"<<endl;
    resetSensorPairV3(&A,&B);
    
    return 0;

}