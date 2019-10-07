#include <iostream>
#include <string>
#include "pila.hpp"
#include "Data.hpp"

using namespace std;

      NodoPila::NodoPila(Data *data, NodoPila *sig)
      {
            this->sig = sig;
            this->data = data;
      }

     void Pila::push(NodoPila *nodo)
     {
         nodo -> sig = this->cab;
         cab ->sig = nodo;
     }

     NodoPila* Pila::pop()
     {
         if(this->cab==NULL)
         {
             return NULL;
         }
         else 
         {
            NodoPila *temp;
            temp = this->cab;
            this->cab = temp->sig;
            return temp;
         }
     }

     bool Pila::esVacia()
     {
        if(this->cab == NULL)
        {
            return true;
        }else
        {
            return false;
        }
     }