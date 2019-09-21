#include <iostream>
#include <string>
#include "pilaStr.h"

using namespace std;

NodoPilaStr::NodoPilaStr(string n, NodoPilaStr *sig)
{
    this->n = n;
    this ->sig = sig;
}

void PilaStr::push(NodoPilaStr *nodo)
{
    nodo -> sig = this->cab;
    this->cab = nodo;
}

NodoPilaStr* PilaStr::pop()
{
    if(this->cab==NULL)
    {
        return NULL;
    }else
    {
        NodoPilaStr *temp;
        temp = this->cab;
        this->cab = temp->sig;
        return temp;
    }
}

bool PilaStr::esVacia()
{
    if(this->cab==NULL)
    {
        return true;
    }else 
    {
        return false;
    }
}