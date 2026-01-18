#include<iostream>
using namespace std;
class product
{
private:
    int code;
    char name[30];
    int quantity;
    float price;
public:
    void setproduct();
    void getproduct();
    float investment();
};
void product::setproduct()
{
    cout<<"Enter the code of the product: "<<endl;
    cin>>code;
    cout<<"Enter the name of the product: "<<endl;
    cin>>name;
    cout<<"Enter the quantity of the product: "<<endl;
    cin>>quantity;
    cout<<"Enter the price of the product: "<<endl;
    cin>>price;
}
void product::getproduct()
{
    cout<<"The code of the product: "<<code<<endl;
    cout<<"The name of the product: "<<name<<endl;
    cout<<"The quantity of the product: "<<quantity<<endl;
    cout<<"The price of the product: "<<price<<endl;
}
float product::investment()
{
    float value=quantity*price;
    return value;
}
int main()
{
    product p1;
    p1.setproduct();
    p1.getproduct();
    float invest=p1.investment();
    cout<<"Total investment: "<<invest<<endl;
}

