#include <iostream>
using namespace std;

class Product{
    int productId;
    string name;
    double price;
    int quantity;

public:
    void acceptDetails(){
        cin>>productId;
        cin>>name;
        cin>>price;
        cin>>quantity;
    }
    double totalValue() const{
        return price*quantity;
    }
    bool isLowStock(int threshold) const{
        return quantity<threshold;
    }
    void displayDetails() const{
        cout<<productId<<" "<<name<<" "<<price<<" "<<quantity<<" "<<totalValue();
    }

};
int main(){
    Product products[5];

    for(int i=0; i<5; i++){
        products[i].acceptDetails();
    }

    cout<<"===== INVENTORY REPORT ====="<<endl;
    cout<<"ID Name Price Qty Total Value"<<endl;

    for(int i=0; i<5; i++){
        products[i].displayDetails();
    }

    int highest=0;
    for(int i=0; i<5; i++){
        if(products[i].totalValue() > products[highest].totalValue()){
            highest=i;
        }
    }

    cout<<"Highest Value Product:"<<endl;
    products[highest].displayDetails();
    cout<<endl;

    int threshold;
    cout<<"Enter low stock threshold: ";
    cin>>threshold;

    cout<<"Low Stock Products:"<<endl;
    
    for(int i=0; i<5; i++){
        if(products[i].isLowStock(threshold)){
            products[i].displayDetails();
            cout<<endl;
        }
    }

    return 0;
}

