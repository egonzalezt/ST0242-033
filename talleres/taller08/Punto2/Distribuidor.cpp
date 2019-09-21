#include <iostream>
#include <string>
#include "Neveras.hpp"
#include "pila.hpp"
#include "Distribuidor.hpp"

using namespace std;

    Distribuidor::Distribuidor(string nombre,int solicitud)
    {
        this->nombre =nombre;
        this->solicitud = solicitud;
    }

    void Distribuidor::neveras(Pila *Nevera)
    {
        fridge = Nevera;
    }

    void Distribuidor::printnev()
    {
        cout<<"........................."<<endl;
        cout<<fridge->getStock()<<endl;
        while(!fridge->esVacia())
        {
            cout<<fridge->pop()->print()<<endl;   
        }
    }

    int Distribuidor::getsoli()
    {
        return this->solicitud;
    }

    Pila* Distribuidor::getdata()
    {
        return this->fridge;
    }
