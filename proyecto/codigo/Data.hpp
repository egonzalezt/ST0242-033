#pragma once
#include <iostream>
#include <string>
using namespace std;

class Data {
    public:
    Data(string ph, string soil_temperature, string soil_moisture,
    string illuminance, string env_temperature, string env_humidity, string label);
    ~Data(){}
    string ph;
    string soil_temperature; 
    string soil_moisture;
    string illuminance;
    string env_temperature;
    string env_humidity;
    string label;
    private:
    
};