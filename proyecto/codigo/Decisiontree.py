from pydotplus.graphviz import graph_from_dot_data
from sklearn.tree import DecisionTreeClassifier
from sklearn.tree import export_graphviz
from sklearn import tree
from scipy import misc 
import pandas as pd
import numpy as np

'''
Librerias necesarias
- https://www.anaconda.com/distribution/
- https://pypi.org/project/pip/
- https://anaconda.org/anaconda/pil
- https://pandas.pydata.org/pandas-docs/stable/install.html
- https://scikit-learn.org/stable/install.html
- https://anaconda.org/conda-forge/pydotplus
- https://pypi.org/project/numpy/
'''


data = pd.read_csv('data_set_train.csv') 

variables = ['ph', 'soil_temperature', 'soil_moisture', 'illuminance','env_temperature', 'env_humidity']                   

Indep = data[variables].values 

Dep = data['label'].values

Arbol = DecisionTreeClassifier(criterion="gini", random_state=100, max_depth=4, min_samples_leaf=5)

Arbol.fit(Indep, Dep) 

print("Generando imagen del arbol")

dot_data = export_graphviz( Arbol,filled=True, rounded=True,class_names=['yes', 'no'],feature_names=variables)

graph = graph_from_dot_data(dot_data)                 
graph.write_png('tree.png')   
