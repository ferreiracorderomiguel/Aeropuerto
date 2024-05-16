# Fundamentos de Programación
# Ejercicio de teoría: Vuelos - Bloque 04 - Tratamientos secuenciales con stream sencillos

**Autor:** José C. Riquelme 
**Revisores:**  Toñi Reina. 
**Última modificación:** 19/04/2022.

# **1 Objetivos**

El objetivo de este bloque es trabajar con tratamientos secuenciales con *stream* simples.


## EJERCICIOS

En el tipo contenedor **VuelosB4** añada las siguientes operaciones e impleméntelas exclusivamente con stream


1.	Dado un destino, existe algún vuelo con ese destino.

2.	Dado un número n devuelve cierto si todos los vuelos tienen al menos n pasajeros.

3.	Dada una fecha, cuántos vuelos hay ese día. 

4.	Dada una fecha devuelve una lista con los vuelos posteriores a esa fecha.

5.	Dada una fecha devuelve un conjunto con los destinos de los vuelos anteriores a esa fecha.

6.	Dado un conjunto de destinos devuelve el número de pasajeros a los destinos del conjunto.

7.	Dado un mes como un entero devuelve el precio medio de los vuelos de ese mes.

8.	Dado un año como un entero devuelve la recaudación de los vuelos de ese año. Suponga que todos los pasajeros pagan el mismo precio.

9.	Devuelve el vuelo con mayor número de pasajeros. Si no se puede calcular devuelve null.

10.	Dado un destino devuelve el código del vuelo de menor precio que vuela a ese destino. Eleva *NoSuchElementException* si no se puede calcular.

11.	Dado un número *n* devuelve una lista con los n vuelos más baratos.

12.	Dado un número *n* devuelve una lista con los n vuelos de mayor duración.


Los resultados esperados para el dataset proporcionado son:

```
===testExisteVueloDestino ==========
	¿Hay algún vuelo con destino Madrid pasajeros? true

===testExisteVueloDestino ==========
	¿Hay algún vuelo con destino Seville pasajeros? false

===testTodosVuelosAlMenosNPasajeros ==========
	¿Tienen todos al menos 100 pasajeros? false

===testTodosVuelosAlMenosNPasajeros ==========
	¿Tienen todos al menos 1000 pasajeros? false

===testGetNumVuelosFecha ==========
	 Hay 2 vuelos en la fecha 2023-06-04

===testGetVuelosPosteriores ==========
	 Los vuelos posteriores a 2023-06-04 son 
		Vuelo [Trayecto=Trayecto[origen=Amsterdam, destino=Madrid], codigo=KL501, fecha=2023-06-05]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Frankfurt], codigo=LH600, fecha=2023-06-05]
		Vuelo [Trayecto=Trayecto[origen=Frankfurt, destino=Madrid], codigo=LH601, fecha=2023-06-06]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=New York], codigo=AA700, fecha=2023-06-06]
		Vuelo [Trayecto=Trayecto[origen=New York, destino=Madrid], codigo=AA701, fecha=2023-06-07]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Milan], codigo=AZ800, fecha=2023-06-07]
		Vuelo [Trayecto=Trayecto[origen=Milan, destino=Madrid], codigo=AZ801, fecha=2023-06-08]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Munich], codigo=EW900, fecha=2023-06-08]
		Vuelo [Trayecto=Trayecto[origen=Munich, destino=Madrid], codigo=EW901, fecha=2023-06-09]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Rome], codigo=VY1000, fecha=2023-06-09]
		Vuelo [Trayecto=Trayecto[origen=Rome, destino=Madrid], codigo=VY1001, fecha=2023-06-10]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Barcelona], codigo=IB100, fecha=2023-06-10]
		Vuelo [Trayecto=Trayecto[origen=Barcelona, destino=Madrid], codigo=IB101, fecha=2023-06-11]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Valencia], codigo=RY200, fecha=2023-06-11]
		Vuelo [Trayecto=Trayecto[origen=Valencia, destino=Madrid], codigo=RY201, fecha=2023-06-12]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Paris], codigo=KL300, fecha=2023-06-12]
		Vuelo [Trayecto=Trayecto[origen=Paris, destino=Madrid], codigo=KL301, fecha=2023-06-13]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=London], codigo=BA400, fecha=2023-06-13]

===testGetVuelosAnteriores ==========
	 Los vuelos anteriores a 2023-06-04 son 
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Barcelona], codigo=IB100, fecha=2023-06-01]
		Vuelo [Trayecto=Trayecto[origen=Barcelona, destino=Madrid], codigo=IB101, fecha=2023-06-01]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=London], codigo=BA400, fecha=2023-06-03]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Paris], codigo=AF300, fecha=2023-06-02]
		Vuelo [Trayecto=Trayecto[origen=Paris, destino=Madrid], codigo=AF301, fecha=2023-06-03]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Valencia], codigo=RY200, fecha=2023-06-01]
		Vuelo [Trayecto=Trayecto[origen=Valencia, destino=Madrid], codigo=RY201, fecha=2023-06-02]

===testGetNumPasajerosConDestinos ==========
	 Hay 1190 pasajeros para los destinos [Madrid, Barcelona] son 

===testGetPrecioMedioVuelosMes ==========
	El precio medio de los vuelos en el mes 6 es 111,175926 

===testGetRecaudacion ==========
	La recaudación de los vuelos en el año 2023 es 180924,500000 

===testGetVueloMasPasajeros ==========
	El vuelo con más pasajeros es Vuelo [Trayecto=Trayecto[origen=Barcelona, destino=Madrid], codigo=IB101, fecha=2023-06-11]

===testGetCodigoVueloMenorPrecio ==========
	El vuelo con destino Madrid con menor precio es RY201

===testGetNVuelosMasBaratos ==========
	Los 5 vuelos más baratos son
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Valencia], codigo=RY200, fecha=2023-06-01]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Valencia], codigo=RY200, fecha=2023-06-11]
		Vuelo [Trayecto=Trayecto[origen=Valencia, destino=Madrid], codigo=RY201, fecha=2023-06-02]
		Vuelo [Trayecto=Trayecto[origen=Valencia, destino=Madrid], codigo=RY201, fecha=2023-06-12]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Barcelona], codigo=IB100, fecha=2023-06-01]

===testGetNVuelosMasDuracion ==========
	Los 5 vuelos con más duración son
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=New York], codigo=AA700, fecha=2023-06-06]
		Vuelo [Trayecto=Trayecto[origen=New York, destino=Madrid], codigo=AA701, fecha=2023-06-07]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=London], codigo=BA400, fecha=2023-06-03]
		Vuelo [Trayecto=Trayecto[origen=London, destino=Madrid], codigo=BA401, fecha=2023-06-04]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=London], codigo=BA400, fecha=2023-06-13]
```