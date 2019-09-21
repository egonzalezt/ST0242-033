#pragma once
#include <iostream>
#include <string>

using namespace std;

class NodoPila 
{
   public:
      NodoPila(int n, NodoPila *sig);
      int n;
      NodoPila *sig;
   private:
};

class Pila
{
   public:
     Pila(){this->cab = NULL;}
     NodoPila *cab;
     
     void push(NodoPila *nodo);
     NodoPila* pop();

     bool esVacia();  
};