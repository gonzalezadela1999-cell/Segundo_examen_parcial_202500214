# Examen Parcial - Estructuras de Datos
## Información del Estudiante
- **Nombre:** Adela Margarita González Chamalé
- **Carné:** 202500214
- **Curso:** Estructuras de Datos
- **Catedrático:** Ing. Brandon Chitay

## Descripción del Proyecto
Este proyecto consiste en la implementación técnica de una Lista Doblemente Enlazada Circular en lenguaje Java, El sistema organiza la información en nodos que contienen un dato entero y dos referencias (anterior y siguiente), permitiendo una navegación bidireccional y un ciclo cerrado donde el último elemento se conecta nuevamente con el primero. El programa permite gestionar dinámicamente la memoria mediante operaciones de inserción, eliminación y búsqueda, garantizando la integridad de los punteros en cada movimiento.

## Video Explicativo
https://youtu.be/1grGtYprTvw

## Instrucciones de Compilación y Ejecución
Javac Nodo.java ListaDobleCircular.java Main.java:
Este comando invoca al compilador de Java para procesar los tres archivos fuente del proyecto simultáneamente. El compilador verifica que la estructura de los nodos, la lógica de los punteros en la lista y la implementación del menú interactivo no contengan errores de sintaxis.

java Main:
Esta instrucción carga la clase principal en la Máquina Virtual de Java (JVM). Al ejecutarse, se reserva espacio en la memoria para la estructura de datos y se despliega el menú interactivo que permite al usuario realizar operaciones de inserción, eliminación y búsqueda en tiempo real.

## Resultados
--- LISTA DOBLEMENTE ENLAZADA CIRCULAR ---
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
Seleccione una opción: 1
Ingrese valor: 9
Lista: 9 <-> (circular -> 9)

--- LISTA DOBLEMENTE ENLAZADA CIRCULAR ---
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
Seleccione una opción: 2
Ingrese valor: 8
Lista: 9 <-> 8 <-> (circular -> 9)

--- LISTA DOBLEMENTE ENLAZADA CIRCULAR ---
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
Seleccione una opción: 1
Ingrese valor: 7
Lista: 7 <-> 9 <-> 8 <-> (circular -> 7)

--- LISTA DOBLEMENTE ENLAZADA CIRCULAR ---
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
Seleccione una opción: 2
Ingrese valor: 6
Lista: 7 <-> 9 <-> 8 <-> 6 <-> (circular -> 7)

--- LISTA DOBLEMENTE ENLAZADA CIRCULAR ---
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
Seleccione una opción: 3
Lista: 9 <-> 8 <-> 6 <-> (circular -> 9)

--- LISTA DOBLEMENTE ENLAZADA CIRCULAR ---
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
Seleccione una opción: 4
Lista: 9 <-> 8 <-> (circular -> 9)

--- LISTA DOBLEMENTE ENLAZADA CIRCULAR ---
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
Seleccione una opción: 5
Valor a buscar: 14
No encontrado.

--- LISTA DOBLEMENTE ENLAZADA CIRCULAR ---
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
Seleccione una opción: 5
Valor a buscar: 8
¡Encontrado!

--- LISTA DOBLEMENTE ENLAZADA CIRCULAR ---
1. Insertar al inicio
2. Insertar al final
3. Eliminar al inicio
4. Eliminar al final
5. Buscar elemento
6. Imprimir lista
7. Salir
Seleccione una opción: 6
Lista: 9 <-> 8 <-> (circular -> 9)

## Estructura del Proyecto
ListaDobleCircular.java:
Es la clase donde se programa toda la lógica de control para gestionar los nodos, asegurando que el último elemento siempre apunte al primero para formar un ciclo cerrado.

Main.java:
Este archivo funciona como el centro de mando y la interfaz principal, encargándose de mostrar el menú interactivo con el que el usuario puede elegir qué acción realizar.

Nodo.java:
Es la unidad básica de almacenamiento que define la estructura de cada eslabón en la lista, conteniendo el valor numérico y las dos referencias necesarias para conectarse con sus vecinos.

