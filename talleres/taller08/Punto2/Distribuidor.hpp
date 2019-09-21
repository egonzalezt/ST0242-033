#pragma once
#include <iostream>
#include <string>
#include "pila.hpp"

using namespace std;

class Distribuidor
{
    public:
        Distribuidor(string nombre,int solicitud);
        int getsoli();
        void neveras(Pila *Neveras);
        void printnev();
        Pila* getdata();
        string nombre;
        Pila *fridge;
    private:
        int solicitud;
};
