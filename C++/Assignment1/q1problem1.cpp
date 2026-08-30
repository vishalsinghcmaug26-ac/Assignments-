#include <iostream>
using namespace std;

int main(){
    double temperature;
    cout<<"Enter temperature= ";
    cin>>temperature;

    double farenheit;
    farenheit=(temperature*(9/5))+32;
    cout<<"Temperature: "<<temperature<<"C "<<" / "<<farenheit<<"F "<<endl;

    int status;

    if(temperature<0){
       status= -1;
    }
    else if(temperature<=29){
       status= 0;
    }
    else if(temperature<=44){
       status= 1;
    }
    else if(temperature<=59){
       status= 2;
    }
    else{
       status= 3;
    }

    switch(status){
         case -1:
            cout<<"Status: SENSOR_ERROR"<<endl;
            cout<<"Action: Sensor fault --Check wiring"<<endl;
            break;
         case 0:
            cout<<"Status: NORMAL"<<endl;
            cout<<"Action: No action required"<<endl;
            break;
         case 1:
            cout<<"Status: WARNING"<<endl;
            cout<<"Action: Alert sent to Supervisor"<<endl;
            break;
         case 2:
            cout<<"Status: CRITICAL"<<endl;
            cout<<"Action: Cooling system triggered"<<endl;
            break;
         case 3:
            cout<<"Status: SHUTDOWN"<<endl;
            cout<<"Action: Emergency shutdown initiated"<<endl;
            break;
     }

         cout<<"Reading: "<<(temperature>25 ? "Above Average" : "Below Average")<<endl;
 
      return 0;
}














