#include <iostream>
#include <string>
#include <memory>
using namespace std;

class Texture{
    string name;
    int width;
    int height;

public:
    Texture(string n, int w, int h):name(n),width(w),height(h){
        cout<<"[Texture Loaded]"<<endl;
    }
    ~Texture(){
        cout<<"[Texture Realeased]"<<endl;
    }
    void display() const{
        cout<<"Width: "<<width<<endl;
        cout<<"Height: "<<height<<endl;
    }
};

int main(){
    auto tex1 = make_unique<Texture>("player_sprite",512,512);
    tex1->display();
    // unique_ptr<Texture> tex2 = tex1
    // Represents exclusive ownership.
    unique_ptr<Texture> tex2 = move(tex1);
    cout<<"tex1 is null: "<<(tex1 == nullptr?"Yes":"No")<<endl;
    return 0;
}