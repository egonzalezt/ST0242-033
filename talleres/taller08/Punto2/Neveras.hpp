#pragma once
#include <iostream>
#include <string>
using namespace std;

class Neveras{

	int Codigo;
	string descripcion;

	public:
		void setCodigo(int Cod){
		       	Codigo = Cod; 
		}
		int getCode(){
		       	return Codigo; 
		}

		void setDescrip(string Descrip){
			descripcion = Descrip;
		}

		string getDescrip(){

			return descripcion;
		}


};


