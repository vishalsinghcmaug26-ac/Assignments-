#include <iostream>
#include <vector>
#include <string>
#include <utility>
using namespace std;

using Header = pair<string, string>;
using HeaderList = vector<Header>;
using Port = unsigned int;
using IPAddress = string;

typedef unsigned long long RequestID;

void printHeaders(const HeaderList& headers){
    for(const Header& header : headers){
        cout<<header.first<<" : "<<header.second<<endl;
    }
}
int main(){
    RequestID requestId = 1748293847;
    Port serverPort = 8080;

    HeaderList headers = {
        {"Content-Type","application/json"},
        {"Authorization","Bearer eyJhbGci..."},
        {"Accept-Language","en-US"}
    };

    cout<<"Request ID: "<<requestId<<endl;
    cout<<"Server Port: "<<serverPort<<endl;
    cout<<"Headers:"<<endl;

    printHeaders(headers);

    return 0;
}
