# examen_algoritmos
Resolución de 2 problemas de algoritmia

Esta prueba consiste en la realización de 2 algoritmos que revuelvan las 2 problemáticas planteadas a continuación:

1. Un revisor califica dos desafíos, otorgando puntos en una escala del 1 al 100 para tres categorías: claridad del problema , originalidad y dificultad.
La calificación del desafío de Alice es a = (a[0], a[1], a[2]) , y la calificación del desafío de Bob es b = (b[0], b[1], b[2]).

La tarea consiste en encontrar sus puntos de comparación comparando a[0] con b[0] , a [1] con b [1] y a [2] con b [2].
  - Si a[i] > b[i] , entonces Alice recibe 1 punto.
  - Si a[i] < b[i] , entonces Bob recibe 1 punto.
  - Si a[i] = b[i] , ninguna persona recibe un punto.


Los puntos de comparación son los puntos totales que ganó una persona.

Dada una a y b , determinar sus respectivos puntos de comparación.

Ejemplo:
 - a = [1, 2, 3]
 - b = [3, 2, 1]

Para los elementos [0] , Bob recibe un punto porque 3 > 2.

Para los elementos [1] , se consiguen sin puntos ya que 2 = 2

Finalmente, para los elementos [2], 3 > 1 por lo que Alice recibe un punto.

La matriz de retorno es [1,1] con la puntuación de Alice primero y la segunda de Bob.

2. Dada una cadena de texto (string), obtener el número de veces que se repite cada palabra del texto. El texto puede tener puntos y comas, puede tener palabras en
mayúsculas o minúsculas. Devolver resultado en JSON

**Input**: String con un texto

**Output**: Número de apariciones de cada palabra

Ejemplo:

**Input**: “Hola hola mundo”

**Output**: {"hola":2,"mundo":1}

Para poder ejecutar el programa que realiza ambos algoritmos, deberá tener instalado java en su computadora y contará con 2 opciones una vez clonado el repositorio: 

1. Deberá compilar el archivo Examen_algoritmos.java con el comando javac seguido del nombre del archivo. Posteriormente deberá correrlo con el comando java seguido del nombre del .class que se creo a partir de la compilación, en este caso Examen_algoritmos.

2. En caso de contar con Netbeans u otro IDE con soporte para java lo único que deberá hacer es abrir el proyecto y correrlo desde el IDE.

Es importante mencionar que los archivos test1.txt y test2.txt no deben ser eliminados, ya que contienen los casos de prueba respectivos de cada problema. En caso de querer editarlos se deberá contemplar lo siguiente:

- Para el algoritmo 1, el archivo que contiene los casos de prueba es el archivo test1.txt. En caso de querer agregar más caso de prueba, deberá separar cado caso de prueba mediante un salto de linea y respetar la entrada de acuerdo al problema.

- Para el algoritmo 2, el archivo que contiene el caso de prueba es el archivo test2.txt. El caso de prueba consiste en un texto, para el cual se contará el número de apariciones de cada una de las palabras que lo conforman.
