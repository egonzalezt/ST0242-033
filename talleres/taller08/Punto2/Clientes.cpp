#include <iostream>
#include <string>
#include "Clientes.hpp"

using namespace std;

    Nodoclientes::Nodoclientes(Distribuidor *distri)
    {
        this->distri = distri;
    }

    void Pilacli::push(Nodoclientes *nodo)
    {
        nodo -> sig = this->cab;
        this -> cab = nodo;
        usuarios++;
    }

    int Pilacli::getClientes()
    {
        return this->usuarios;
    }   

    Nodoclientes* Pilacli::pop()
    {
        if(this->cab == NULL)
        {
            return NULL;
        }else
        {
            Nodoclientes *temp;
            temp = this->cab;
            this->cab = this->cab->sig;
            usuarios--;
            return temp;
        }
    }

    bool Pilacli::esVacia()
    {
        if(this->cab==NULL)
        {
            return true;
        }else 
        {
            return false;
        }
    }
