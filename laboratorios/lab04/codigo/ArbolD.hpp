#pragma once
#include <iostream>
#include <string>
#include "ArbolA.hpp"

using namespace std;

struct nodoD 
{
        double size;
        string name;
        string folder;
        ArbolA *a;
        nodoD* left;
        nodoD* right;
};

class ArbolD 
{    
    public:

    nodoD* root;

    nodoD* insert(string name, string folder, nodoD* t, ArbolA *a);

    void Postorden(nodoD* t);

};