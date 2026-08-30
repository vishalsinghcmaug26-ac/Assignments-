#include <iostream>
using namespace std;

int main(){
    double temp[3][3];

    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            cout<<"Enter temperature for Floor "<<i+1<<",Room"<<j+1<<": ";
            cin>>temp[i][j];
        }
    }

    cout<<"\tRoom1\tRoom2\tRoom3"<<endl;

    for(int i=0; i<3; i++){
        cout<<"Floor "<<i+1<<":";
        for(int j=0; j<3; j++){
            cout<<temp[i][j]<<"\t";
        }
        cout<<endl;
    }

    double hottest = temp[0][0];
    int hotFloor = 0;
    int hotRoom = 0;

    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            if(temp[i][j]>hottest){
                hottest=temp[i][j];
                hotFloor=i;
                hotRoom=j;
            }
        }
    }

    cout<<"Hottest Room: Floor"<<hotFloor+1<<", Room"<<hotRoom+1<<"->"<<hottest<<" C"<<endl;

    double highestAverage= -999;
    int hottestFloor= 0;

    for(int i=0; i<3; i++){
        double sum= 0;
        for(int j=0; j<3; j++){
            sum= sum+temp[i][j];
        }
        double average= sum/3;
        if(average>highestAverage){
            highestAverage=average;
            hottestFloor=i;
        }
    }

    cout<<"Hottest Floor: "<<hottestFloor+1<<"(avg"<<highestAverage<<" C)"<<endl;
    
    int warningCount=0;
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            if(temp[i][j>=30]){
                warningCount++;
            }
        }
    }

    cout<<"Rooms at WARNING or above: "<<warningCount<<endl;
    
    return 0;
}