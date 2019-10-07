#include <iostream>
#include <string>
#include "Data.hpp"

Data::Data(string ph, string soil_temperature, string soil_moisture,
       string illuminance, string env_temperature, string env_humidity, string label)
{
   this -> ph = ph;
   this -> soil_temperature = soil_temperature; 
   this -> soil_moisture = soil_moisture; 
   this -> illuminance = illuminance;
   this -> env_temperature = env_temperature;
   this -> env_humidity = env_humidity;
   this -> label = label;
}
