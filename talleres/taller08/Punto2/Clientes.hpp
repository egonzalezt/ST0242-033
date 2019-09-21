#pragma once
#include <iostream>
#include <string>
#include "Distribuidor.hpp"

using namespace std;

class Nodoclientes {
   public:
      Nodoclientes(Distribuidor *distri);
      Distribuidor *distri;
      Nodoclientes *sig;

};

class Pilacli{
   public:
      Pilacli()
      {
         this->cab = NULL;
         usuarios=0;
      }
      Nodoclientes *cab;
      void push(Nodoclientes *nodo);
      int getClientes();
      Nodoclientes* pop();
      bool esVacia(); 
      private:
      int usuarios; 
};