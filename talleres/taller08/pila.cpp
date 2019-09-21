#include <iostream>
#include <string>
#include "pila.h"

using namespace std;

NodoPila::NodoPila(int n, NodoPila *sig)
{
    this->n = n;
    this ->sig = sig;
}

void Pila::push(NodoPila *nodo)
{
    nodo -> sig = this->cab;
    this->cab = nodo;
}

NodoPila* Pila::pop()
{
    if(this->cab==NULL)
    {
        return NULL;
    }else
    {
        NodoPila *temp;
        temp = this->cab;
        this->cab = cab->sig;
        return temp;
    }
}

bool Pila::esVacia()
{
    if(this->cab==NULL)
    {
    return true;
    }else 
    {
    return false;
    }
}