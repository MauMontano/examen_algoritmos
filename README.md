# examen_algoritmos

## Resolución de 2 problemas de algoritmia

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

## Patrones de Diseño

**Problema 1**: Un cliente requiere utilizar sendgrid para envíos de email, pero otro cliente requiere enviarlos por mandril. Se quiere evitar el uso de IF, y realizar un diseño en donde podamos utilizar más servicios en caso de que un cliente requiera alguno en específico ¿Qué patrón de diseño utilizarías y por qué?

    Opción 1: Strategy

    Opción 2: Factory Method

    Opción 3: Adapter

El patrón de diseño que yo utilizaría es "Factory method" ya que este patrón nos permite crear objetos de diferente tipo, en este caso de cada uno de los servicios de envíos de email, los cuales deben implementar una interface de uso común. Dicha interface será la encargada de entregarle los resultados al cliente, sin que este sepa que es lo que hay detrás del resultado obtenido, ya que a este no le importa que tipo de objeto o servicio se implementó, sino que el resultado sea el esperado.

**Problema 2**: Explica en tus propias palabras la diferencia entre Factory Method y Abstract Factory. Y proporciona un caso de uso.

***Factory Method***

Este patrón nos permite crear objetos sin exponer la lógica de creación al cliente o usuario final. Esto haciendo uso de la misma interfaz común para crear un nuevo tipo de objeto. La principal idea de este método es poder la creación y utilización de diferentes tipos de objetos dependiendo de las necesidades del cliente, sin que este se entere que hay detrás del resultado obtenido, ya que este método requiere el uso de una interfaz común para la entrega del resultado al cliente.


***Abrstract Factory***

Este método nos proporciona interfaces para crear familias de objetos que guarden cierta relación, sin necesidad de especificar sus clases concretas. Este patrón puede resultar sumamente útil cuando se requiere hacer uso de polimorfismo, ya que este caso nos conviene que en tiempo de ejecución, se pueda elegir entre la clase que más convenga de acuerdo al problema a solucionar. Lo anterior haciendo uso de casteo hacia arriba (upcasting) o hacia abajo (dowcasting).


