#include <iostream>
#include <string>
#include <sstream>
#include "Neveras.hpp"
#include "pila.hpp"
using namespace std;

    NodoNevera::NodoNevera(int codigo, string Descripcion , NodoNevera *sig)
    {
        this->codigo = codigo;
        this->Descripcion = Descripcion;
        this->sig = sig;
    }

    string NodoNevera::print()
    {
        string txt ="Nevera: Marca: "+this->Descripcion;
        txt = txt + " Codigo: "+ to_string(this->codigo);
        return txt;
    }
 
    void Pila::push(NodoNevera *nodo)
    {
        nodo -> sig = this->cab;
        this -> cab = nodo;
        stock++;
    }

    int Pila::getStock()
    {
        return this->stock;
    }
     
    NodoNevera* Pila::pop()
    {
        if(this->cab == NULL)
        {
            return NULL;
        }else
        {
            NodoNevera *temp;
            temp = this->cab;
            this->cab = this->cab->sig;
            stock--;
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