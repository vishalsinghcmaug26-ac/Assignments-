#include <iostream>
using namespace std;

enum class HttpStatus{
    OK=200,
    Created=201,
    BadRequest=400,
    Unauthorized=401,
    NotFound=404,
    ServerError=500
};

void handleResponse(HttpStatus status, const string& endpoint){
    switch(static_cast<int>(status)){
        case 404:
           cout<<"["<<endpoint<<"]-> 404 Not Found: Endpoint does not exist"<<endl;
           break;
        case 200:
           cout<<"["<<endpoint<<"]-> 200 OK: Request Successful"<<endl;
           break;
        case 401:
           cout<<"["<<endpoint<<"]-> 401 Unauthorized: Authentication required"<<endl;
           break;
        case 500:
           cout<<"["<<endpoint<<"]-> 500 Server Error: Internal Server Error - retry later"<<endl;    
    }
}
int main(){
    handleResponse(HttpStatus::OK,"GET /api/users");
    handleResponse(HttpStatus::Unauthorized,"POST /api/login");
    handleResponse(HttpStatus::NotFound,"GET /api/products/99");
    handleResponse(HttpStatus::ServerError,"POST /api/order");
}