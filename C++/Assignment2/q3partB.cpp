#include <iostream>
using namespace std;

namespace Physics{
    double clamp(double val, double min, double max){
        if(val<min)
        return min;

        if(val>max)
        return max;

        return val;
    }
    double lerp(double a, double b, double t){
        double ival=a+(b-a)*t;
        return ival;
    }
}

namespace GameMath{
    int clamp(int val, int min, int max){
        if(val<min)
        return min;

        if(val>max)
        return max;

        return val;
    }
    double lerp(double a, double b, double t){
        double ival=a+(b-a)*t;
        return ival;
    }
}

int main(){
    cout<<"Physics Clamp: "<<Physics::clamp(50.0,100.0,25.0)<<endl;
    cout<<"GameMath Clamp: "<<GameMath::clamp(50,100,25)<<endl;
    cout<<"Physics Lerp: "<<Physics::lerp(14.0,5.5,8.0)<<endl;
    cout<<"GameMath Lerp: "<<GameMath::lerp(14.0,99.4,15.6)<<endl;

    {
        using namespace Physics;

        cout<<"Lerp Inside Physics Scope: "<<lerp(14.0,8.1,14.7)<<endl;
    }
    return 0;
}