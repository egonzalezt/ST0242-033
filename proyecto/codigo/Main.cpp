#include <iostream>
#include <fstream>
#include <string>
#include "Data.hpp"
#include "pila.hpp"

int main()
{

    ifstream data;
    data.open("Libro3.csv",ios::in);
    if(!data.is_open())
    {
        cout<<"Error the file could not open"<<endl;
    }

    string ph;
    string soil_temperature; 
    string soil_moisture;
    string illuminance;
    string env_temperature;
    string env_humidity;
    string label;
    Pila *c2 = new Pila();
    while(!data.eof())
    {
        getline(data,ph,',');
        getline(data,soil_temperature,',');
        getline(data,soil_moisture,',');
        getline(data,illuminance,',');
        getline(data,env_temperature,',');
        getline(data,env_humidity,',');
        getline(data,label,',');
        Data *d1 = new Data( ph,  soil_temperature,  soil_moisture,
        illuminance,  env_temperature,  env_humidity,  label);
        c2->push(new NodoPila(d1,NULL)); 
    }
    data.close();
    system("pause");
    return 0;
}