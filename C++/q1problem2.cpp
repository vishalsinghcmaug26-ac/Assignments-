#include <iostream>
#include <iomanip>
using namespace std;
  
int main(){
    int N;
    double readings[100];
    
    cout<<"Enter number of readings: ";
    cin>>N;

    for(int i=0; i<N; i++)
      cin>>readings[i];

    int skipped=0;
    cout<<"Valid Readings: ";

    for(int i=0; i<N; i++){
        if(readings[i]<0){
            skipped++;
            continue;
        }
    cout<<readings[i]<<" ";
    }
    
    cout<<endl;
    cout<<"Skipped (errors): "<<skipped<<endl;
    
    for(int i=0; i<N; i++){
        if(readings[i]>=45){
            cout<<"First CRITICAL: Index"<<i<<"->"<<readings[i]<<" C"<<endl;
            break;
        }
    }
    
    double min=0;
    double max=0;
    double sum=0;
    int validCount=0;
    int normal=0;
    int warning=0;
    int critical=0;
    int shutdown=0;

    bool firstValid=true;

    for(int i=0; i<N; i++){
        if(readings[i]<0)
           continue;

        if(firstValid){
            min=readings[i];
            max=readings[i];
            firstValid=false;
        }

        if(readings[i]<min)
           min=readings[i];

        if(readings[i]>max)
           max=readings[i];

        sum+=readings[i];
        validCount++;

        if(readings[i]<35){
            normal++;
        }
        
        else if(readings[i]<45){
            warning++;
        }

        else if(readings[i]<60){
            critical++;
        }

        else{
            shutdown++;
        }
    }

    double average=sum/validCount;
    cout<< fixed << setprecision(2);

    cout<<"Min: "<<min<<" C";
    cout<<"Max: "<<max<<" C";
    cout<<"Avg: "<<average<<" C"<<endl;

    cout<<"Normal: "<<normal<<"Warning: "<<warning<<"Critical: "<<critical<<"Shutdown: "<<shutdown<<endl;
    return 0;

}