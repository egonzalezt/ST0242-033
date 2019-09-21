#include <iostream>
#include <string>
#include "pila.h"
#include "pilaStr.h"

#include <sstream>
using namespace std;

Pila *pila = new Pila();
PilaStr *operadores = new PilaStr();
Pila *operandos = new Pila();

void analizarExpresion(string expresion)
{
    stringstream expresionRevisada(expresion); 
    string elemento;  
    while(getline(expresionRevisada, elemento, ' ')) 
    {   
        if (elemento.compare("+")==0)
        {
            operadores->push(new NodoPilaStr(elemento, NULL));  
        }else if (elemento.compare("-")==0)
        {
            operadores->push(new NodoPilaStr(elemento, NULL));    
        }else if (elemento.compare("*")==0)
        {

            operadores->push(new NodoPilaStr(elemento, NULL));  

        }else if (elemento.compare("/")==0)
        {
            operadores->push(new NodoPilaStr(elemento, NULL));    
        }else
        {
            operandos->push(new NodoPila(stoi(elemento), NULL));
        }                                       
    }      
}

void Invert()
{
    Pila *operandos1 = new Pila();
    PilaStr *operadores1 = new PilaStr();
    while(!operadores->esVacia())
    {
        operadores1->push(operadores->pop());
    }

    operadores = operadores1;

    while(!operandos->esVacia())
    {
        operandos1->push(operandos->pop());
    }

    operandos = operandos1;

}

int  Polishnot()
{
    Invert();
    int op;
    int elema;
    int elemb;
    string element;  
    while(!operadores->esVacia())
    {   
        element = operadores->pop()->n;
        if (element.compare("+")==0)
        {

            elema=operandos->pop()->n;
            elemb= operandos->pop()->n;
            op = elema + elemb;      
            operandos->push(new NodoPila(op, NULL));

        }else if (element.compare("-")==0)
        {

            elema=operandos->pop()->n;
            elemb= operandos->pop()->n;
            op = elema - elemb;      
            operandos->push(new NodoPila(op, NULL));

        }else if (element.compare("*")==0)
        {
            elema=operandos->pop()->n;
            elemb= operandos->pop()->n;
            op = elema * elemb;      
            operandos->push(new NodoPila(op, NULL));

        }else if (element.compare("/")==0)
        {
            elema=operandos->pop()->n;
            elemb= operandos->pop()->n;
            op = elema / elemb;      
            operandos->push(new NodoPila(op, NULL));

        }else
        {
            return op;
        }
    }    
    return op;
}

int main()
{
    string expresion = "6 5 - 4 + ";;   
    analizarExpresion(expresion);
    cout<<Polishnot()<<endl;

    return 0;

}