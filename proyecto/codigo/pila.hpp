#include <iostream>
#include <string>
#include "Data.hpp"

using namespace std;

class NodoPila {
   public:
      NodoPila(Data *data, NodoPila *sig);
      Data *data;
      NodoPila *sig;
};

class Pila{
   public:
     Pila(){this->cab = NULL;}
     NodoPila *cab;
     
     void push(NodoPila *nodo);
     NodoPila* pop();

     bool esVacia(); 
};
