# Fundamentos de Programación
# Ejercicio de teoría: Vuelos - Bloque 01 - Tipo contenedor

**Autor:** José C. Riquelme 
**Revisores:**  Toñi Reina. 
**Última modificación:** 19/04/2022.

# **1 Objetivos**

El objetivo de este bloque es trabajar un tipo contenedor simple.


## EJERCICIOS


En este segundo bloque se define el tipo contenedor **Vuelos** con la siguiente descripción:

**Propiedades:**

- **nombre:** de tipo *String* con el nombre del contenedor. Consultable.
- **vuelos** de tipo *List\<Vuelo\>*, con los vuelos del contendor. Consultable. 
- **numero vuelos:** de tipo *Integer* con el precio del vuelo. Consultable.
- **numero pasajeros:** de tipo *Integer* con el número total de pasajeros de todos los vuelos. 
- **precio medio:** de tipo *Double* con el precio medio de todos los vuelos. Consultable.
- **numero destinos** de tipo *Integer* con el número de destinos diferentes. Consultable.

**Constructor:**

- **C1**: Crea un objeto tomando como parámetros las propiedades básicas del mismo, en el orden en el que se describen arriba.

**Representación como cadena:**

- Una cadena formada por la representación como cadena de todos los vuelos, separados unos de otros por un salto de linea.

**Criterio de igualdad:**

- Dos objetos de tipo **Vuelos** son iguales si lo son su código y la lista de vuelos.

**Otras operaciones:**

- *Integer getNumPasajerosDestino(String destino)*: Dado un destino devuelve el número de pasajeros a ese destino.
- *void incorporaVuelo(Vuelo v)*: Dado un vuelo *v*, lo incorpora a los vuelos del contenedor.
- *void incorporaVuelos(Collection<Vuelo> vuelos)*: Dada una colección de vuelos, incorpora los vuelos de la colección al contendor.
- *void eliminaVuelo(Vuelo v)*: Dado un vuelo *v*, lo elimina del contenedor. Si no existe, no hace nada.
- *void ordena()*: Ordena los vuelos del contenedor por su orden natural.
- *Boolean existeVueloDestino(String destino)*: Dado un destino, devuelve cierto si en el contenedor hay algún vuelo a ese destino. 


