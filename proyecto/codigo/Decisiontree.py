from pydotplus.graphviz import graph_from_dot_data
from sklearn.tree import DecisionTreeClassifier
from sklearn.tree import export_graphviz
import pandas as pd
import time

'''
Para la correcta ejecucion del codigo se necesitaran las siguientes librerias:

(librerias base)

- https://www.anaconda.com/distribution/
- https://pypi.org/project/pip/

(librerias del codigo)

- https://pandas.pydata.org/pandas-docs/stable/install.html
- https://scikit-learn.org/stable/install.html
- https://anaconda.org/conda-forge/pydotplus
'''

'''
Clase Decisiontree

    Implementacion del arbol de decision 'CART' implementando el indice de gini, para ejecutar el codigo se necesita las librerias mencionadas anteriormente,
    adicionalmente se debe poner en la carpeta donde se encuentra el codigo el archivo csv que posteriormente se mencionara donde se seleccionara el nombre del csv,
    finalmente durante la ejecucion del codigo se creara un archivo con extension '.png' que sera el arbol generado con los datos contenidos en el csv.
'''

def Decisiontree():

    # Lectura del archivo csv con el nombre 'data_set_train.csv' si se desea utilizar otro archivo se debe modificar este valor por el nombre del archivo

    data = pd.read_csv('data_set_train.csv') 

    # Varibles del archivo csv que seran utilizadas en Indep y en Dep. 

    variables = ['ph', 'soil_temperature', 'soil_moisture', 'illuminance','env_temperature', 'env_humidity']                   

    # Indep y Dep son las variables independientes y dependientes que seran necesarias para entrenar el arbol

    Indep = data[variables].values 

    Dep = data['label'].values
    try:
        print(" Digite los valores separados por comas a evaluar: \n")
        print("ph  soil_temperature  soil_moisture  illuminance  env_temperature  env_humidity")

        # Lectura de los valores digitados en la consola, estos seran procesados para luego ser evaluados.
        # Esta parte del codigo leera los valores digitados para despues almacenarlos en un arreglo que sera implementado futuramente.

        str = input("-> ")
        list = str.split (",")
        PredicVals = []
        for i in list:
    	    PredicVals.append(float(i))

        # Esta parte del codigo se implementara para predecir el valor previamente digitado y almacenado en un arreglo para detectar 
        # si el valor digitado tiene o no roya por lo cual para realizar este paso es necesario primero entrenar al arbol para que pueda detectar el patron.

    except ValueError:
        print ("Error! Valor no valido. Intentelo otra vez...")

'''
Metodo Exetime

    Este metodo sera implementado para la toma de tiempos de las diferentes funciones implementadas en el metodo Decisiontree,
    su objetivo es tomar los tiempos y luego registrarlos en el informe.

    adicionalmente para la toma de tiempos se implemento la libreria time para obtener los resultados de los tiempos que seran en segundos (s)

'''

def Exetime():

    '''
    La estructura general de este metodo es implementar time.time() que tomara el tiempo que se demore en ejecutar alguna de la funciones del metodo
    decision tree, por lo cual time.time() sera aplicado como Tfinal - Tinicial para conocer el tiempo total de ejecucion de cada funcion, y este resultado
    sera previamente mostrado en pantalla.
    '''
    
    # Toma de tiempos para la lectura del archivo csv
    time1 = time.time()
    data = pd.read_csv('data_set.csv') 
    time2 = time.time()
    print("Tiempo de lectura del archivo csv: \n -> ", time2-time1,"s \n")

    # Toma de tiempos para la creacion del arbol
    time3 = time.time()

    print("Tiempo de creacion del arbol: \n -> ", time4-time3,"s \n")

    # Toma de tiempos para el entrenamiento del arbol con los datos obtenidos en el csv
    time5 = time.time()
    Arbol.fit(Indep, Dep) 
    time6 = time.time()
    print("Tiempo de entrenamiento del arbol: \n -> ", time6-time5,"s \n")

if __name__ == '__main__':

    print("1 Para ejecutar el arbol")
    print("2 Para ver los tiempos de ejecucion")
    
    try:
        
        Seleccion = int(input("-> "))
        
        if Seleccion==1: 
            print()
            Decisiontree()
        elif Seleccion==2:
            print()
            Exetime()
        else: print("Selecciono una tecla no valida")
    except ValueError:
        print ("Error! Valor no valido. Intentelo otra vez...")
        
