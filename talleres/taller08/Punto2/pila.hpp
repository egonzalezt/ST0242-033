#pragma once
#include <iostream>
#include <string>

using namespace std;

class NodoNevera {
   public:
      NodoNevera(int codigo, string Descripcion , NodoNevera *sig);
      string print();
      int codigo;
      string Descripcion;
      NodoNevera *sig;
   private:
     //------
};

class Pila{
   public:
      Pila()
      {
         this->cab = NULL;
         stock=0;
      }
      NodoNevera *cab;
      void push(NodoNevera *nodo);
      int getStock();
      NodoNevera* pop();
      bool esVacia(); 
      private:
      int stock; 

};