#include <iostream>
using namespace std;

double reorderCost(int qty, double unitPrice){
    return qty*unitPrice;
}

double reorderCost(double qty, double unitPrice){
    return qty*unitPrice;
}

double reorderCost(int qty, double unitPrice, double taxRate){
    double total = qty*unitPrice;
    double taxAmt = (total*taxRate)/100;
    double amount = total*taxAmt;
    return amount;
}

double applyDiscount(double price, double discountPercent=10.0){
    double discAmt = (price*discountPercent)/100;
    return price-discAmt;
}

int main(){
    double result1 = reorderCost(10,50.0);
    cout<<"Result1: "<<result1<<endl;
    double result2 = reorderCost(2.5,50.0);
    cout<<"Result2: "<<result2<<endl;
    double result3 = reorderCost(10,50.0,18.0);
    cout<<"Result3: "<<result3<<endl;
    double result4 = applyDiscount(1000.0);
    cout<<"Result4: "<<result4<<endl;
    double result5 = applyDiscount(1000.0,20.0);
    cout<<"Result5: "<<result5<<endl;

    return 0;
}
