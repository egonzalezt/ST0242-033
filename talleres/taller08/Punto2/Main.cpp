#include <iostream>
#include <stdlib.h>
#include <time.h>
#include "pila.hpp"
#include "Distribuidor.hpp"
#include "Clientes.hpp"

using namespace std;

Pila *pila = new Pila();
Pilacli *cliente = new Pilacli();

void clientes()
{
	cliente->push(new Nodoclientes(new Distribuidor("Exito",3)));
	cliente->push(new Nodoclientes(new Distribuidor("Jumbo",3)));
	cliente->push(new Nodoclientes(new Distribuidor("Falabella",3)));
	cliente->push(new Nodoclientes(new Distribuidor("Marko",3)));
	cliente->push(new Nodoclientes(new Distribuidor("Alkosto",3)));
	cliente->push(new Nodoclientes(new Distribuidor("Flamingo",20)));

	Pilacli *cliente1 = new Pilacli();

	while(!cliente->esVacia())
    {
        cliente1->push(cliente->pop());
    }

	cliente = cliente1;


	while(!cliente->esVacia())
    {
		Distribuidor *temp;
		int stop = temp->getsoli();
		temp = cliente->pop()->distri;
		if(temp->getsoli()<=pila->getStock())
		{
			Pila *temp1 = new Pila();
			while(stop>=0)
			{
				temp1->push(pila->pop());
				stop--;
				cout<<"Adding "<<endl;
			}
			temp->neveras(temp1);
		}else
		{
			cout<<"No hay neveras disponibles"<<endl;
		}
			
    }
}

int main(){

	int num,num2,c;
    srand(time(NULL));
    std::string Marcas[3] = {"LG", "SAMSUNG", "ACEB"};

    for(c = 0; c <= 10; c++)
    {
        num = 1 + rand() % (30 + 19000);
		num2 = rand() % 3;
		pila->push(new NodoNevera(num, Marcas[num2] , NULL));
    }
	
	clientes();

	cout<<"Neveras disponibles: "<<pila->getStock()<<endl;
	
	return 0;
}
