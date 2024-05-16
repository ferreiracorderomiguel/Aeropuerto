# Fundamentos de Programación
# Ejercicio de teoría: Vuelos - Bloque 05 - Tratamientos secuenciales

**Autor:** José C. Riquelme 
**Revisores:**  Toñi Reina. 
**Última modificación:** 19/04/2022.

# **1 Objetivos**

El objetivo de este bloque es trabajar con tratamientos secuenciales con varios pasos y *collectors* para crear Maps sencillos.


## EJERCICIOS

En el tipo contenedor **VuelosB5** añada las siguientes operaciones e impleméntelas exclusivamente con *stream*


1. Dada una fecha f devuelve el número de destinos diferentes de todos los vuelos de fecha

2. Devuelve un conjunto ordenado con los vuelos ordenados por el orden natural del tipo

3. Dada una letra devuelve un conjunto ordenado alfabéticamente de manera ascendente con los destinos que empiezan por esa letra

4. Devuelve un conjunto ordenado por longitud de caracteres con los destinos de todos los vuelos

5. Usa el método collect junto con la clase Collectors para los siguientes ejercicios que ya hemos resuelto de otra manera:

	a. Dada una fecha, cuántos vuelos hay ese día 
	b. Dado un mes como un entero devuelve el precio medio de los vuelos de ese mes
	c. Dado un año como un entero devuelve la recaudación de los vuelos de ese año
	d. Devuelve el Vuelo con mayor número de pasajeros

6. Devuelve un Map que a cada fecha le haga corresponder una lista con sus vuelos

7. Devuelve un Map que a cada fecha le haga corresponder un conjunto con sus vuelos

8. Devuelve un Map que a cada fecha le haga corresponder el número de vuelos

9. Devuelve un Map que a cada destino le haga corresponder el número total de plazas

10. Devuelve un Map que a cada destino le haga corresponder el precio medio de sus vuelos

11. Devuelve un Map que a cada destino le haga corresponder un conjunto con las fechas de los vuelos a ese destino


Los resultados esperados para el dataset proporcionado son:

```
===testGetNumDestinosDiferentesFecha ==========
	 Hay 2 destinos distintos en la fecha 2023-06-04

===testGetVuelosOrdenados ==========
	Los vuelos ordenados son 
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Barcelona], codigo=IB100, fecha=2023-06-01]
		Vuelo [Trayecto=Trayecto[origen=Barcelona, destino=Madrid], codigo=IB101, fecha=2023-06-01]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Valencia], codigo=RY200, fecha=2023-06-01]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Paris], codigo=AF300, fecha=2023-06-02]
		Vuelo [Trayecto=Trayecto[origen=Valencia, destino=Madrid], codigo=RY201, fecha=2023-06-02]
		Vuelo [Trayecto=Trayecto[origen=Paris, destino=Madrid], codigo=AF301, fecha=2023-06-03]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=London], codigo=BA400, fecha=2023-06-03]
		Vuelo [Trayecto=Trayecto[origen=London, destino=Madrid], codigo=BA401, fecha=2023-06-04]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Amsterdam], codigo=KL500, fecha=2023-06-04]
		Vuelo [Trayecto=Trayecto[origen=Amsterdam, destino=Madrid], codigo=KL501, fecha=2023-06-05]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Frankfurt], codigo=LH600, fecha=2023-06-05]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=New York], codigo=AA700, fecha=2023-06-06]
		Vuelo [Trayecto=Trayecto[origen=Frankfurt, destino=Madrid], codigo=LH601, fecha=2023-06-06]
		Vuelo [Trayecto=Trayecto[origen=New York, destino=Madrid], codigo=AA701, fecha=2023-06-07]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Milan], codigo=AZ800, fecha=2023-06-07]
		Vuelo [Trayecto=Trayecto[origen=Milan, destino=Madrid], codigo=AZ801, fecha=2023-06-08]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Munich], codigo=EW900, fecha=2023-06-08]
		Vuelo [Trayecto=Trayecto[origen=Munich, destino=Madrid], codigo=EW901, fecha=2023-06-09]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Rome], codigo=VY1000, fecha=2023-06-09]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Barcelona], codigo=IB100, fecha=2023-06-10]
		Vuelo [Trayecto=Trayecto[origen=Rome, destino=Madrid], codigo=VY1001, fecha=2023-06-10]
		Vuelo [Trayecto=Trayecto[origen=Barcelona, destino=Madrid], codigo=IB101, fecha=2023-06-11]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Valencia], codigo=RY200, fecha=2023-06-11]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Paris], codigo=KL300, fecha=2023-06-12]
		Vuelo [Trayecto=Trayecto[origen=Valencia, destino=Madrid], codigo=RY201, fecha=2023-06-12]
		Vuelo [Trayecto=Trayecto[origen=Madrid, destino=London], codigo=BA400, fecha=2023-06-13]
		Vuelo [Trayecto=Trayecto[origen=Paris, destino=Madrid], codigo=KL301, fecha=2023-06-13]

===testGetDestinosOrdenados ==========
	Los destinos ordenados son 
		Barcelona

===testGetDestinosOrdenadosPorLongitud ==========
	 Los destinos ordenados por destino son 
		Rome
		Milan
		Paris
		London
		Madrid
		Munich
		New York
		Valencia
		Amsterdam
		Barcelona
		Frankfurt

===testGetNumVuelosFecha ==========
	 Hay 2 vuelos en la fecha 2023-06-04

===testGetPrecioMedioVuelosMes ==========
	El precio medio de los vuelos en el mes 6 es 111,175926 

===testGetRecaudacion ==========
	La recaudación de los vuelos en el año 2023 es 180924,500000 

===testGetVueloMasPasajeros ==========
	El vuelo con más pasajeros es Vuelo [Trayecto=Trayecto[origen=Barcelona, destino=Madrid], codigo=IB101, fecha=2023-06-11]

===testGetVuelosPorFecha ==========
	 Los vuelos por fecha son 
		2023-06-13=[Vuelo [Trayecto=Trayecto[origen=Paris, destino=Madrid], codigo=KL301, fecha=2023-06-13], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=London], codigo=BA400, fecha=2023-06-13]]
		2023-06-12=[Vuelo [Trayecto=Trayecto[origen=Valencia, destino=Madrid], codigo=RY201, fecha=2023-06-12], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Paris], codigo=KL300, fecha=2023-06-12]]
		2023-06-11=[Vuelo [Trayecto=Trayecto[origen=Barcelona, destino=Madrid], codigo=IB101, fecha=2023-06-11], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Valencia], codigo=RY200, fecha=2023-06-11]]
		2023-06-10=[Vuelo [Trayecto=Trayecto[origen=Rome, destino=Madrid], codigo=VY1001, fecha=2023-06-10], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Barcelona], codigo=IB100, fecha=2023-06-10]]
		2023-06-09=[Vuelo [Trayecto=Trayecto[origen=Munich, destino=Madrid], codigo=EW901, fecha=2023-06-09], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Rome], codigo=VY1000, fecha=2023-06-09]]
		2023-06-08=[Vuelo [Trayecto=Trayecto[origen=Milan, destino=Madrid], codigo=AZ801, fecha=2023-06-08], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Munich], codigo=EW900, fecha=2023-06-08]]
		2023-06-07=[Vuelo [Trayecto=Trayecto[origen=New York, destino=Madrid], codigo=AA701, fecha=2023-06-07], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Milan], codigo=AZ800, fecha=2023-06-07]]
		2023-06-06=[Vuelo [Trayecto=Trayecto[origen=Frankfurt, destino=Madrid], codigo=LH601, fecha=2023-06-06], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=New York], codigo=AA700, fecha=2023-06-06]]
		2023-06-05=[Vuelo [Trayecto=Trayecto[origen=Amsterdam, destino=Madrid], codigo=KL501, fecha=2023-06-05], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Frankfurt], codigo=LH600, fecha=2023-06-05]]
		2023-06-04=[Vuelo [Trayecto=Trayecto[origen=London, destino=Madrid], codigo=BA401, fecha=2023-06-04], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Amsterdam], codigo=KL500, fecha=2023-06-04]]
		2023-06-03=[Vuelo [Trayecto=Trayecto[origen=Paris, destino=Madrid], codigo=AF301, fecha=2023-06-03], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=London], codigo=BA400, fecha=2023-06-03]]
		2023-06-02=[Vuelo [Trayecto=Trayecto[origen=Valencia, destino=Madrid], codigo=RY201, fecha=2023-06-02], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Paris], codigo=AF300, fecha=2023-06-02]]
		2023-06-01=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Barcelona], codigo=IB100, fecha=2023-06-01], Vuelo [Trayecto=Trayecto[origen=Barcelona, destino=Madrid], codigo=IB101, fecha=2023-06-01], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Valencia], codigo=RY200, fecha=2023-06-01]]

===testGetVuelosPorDestino ==========
	 Los vuelos por destino son 
		Munich=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Munich], codigo=EW900, fecha=2023-06-08]]
		New York=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=New York], codigo=AA700, fecha=2023-06-06]]
		Frankfurt=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Frankfurt], codigo=LH600, fecha=2023-06-05]]
		Rome=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Rome], codigo=VY1000, fecha=2023-06-09]]
		Milan=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Milan], codigo=AZ800, fecha=2023-06-07]]
		Amsterdam=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Amsterdam], codigo=KL500, fecha=2023-06-04]]
		Barcelona=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Barcelona], codigo=IB100, fecha=2023-06-01], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Barcelona], codigo=IB100, fecha=2023-06-10]]
		Madrid=[Vuelo [Trayecto=Trayecto[origen=Munich, destino=Madrid], codigo=EW901, fecha=2023-06-09], Vuelo [Trayecto=Trayecto[origen=Barcelona, destino=Madrid], codigo=IB101, fecha=2023-06-01], Vuelo [Trayecto=Trayecto[origen=London, destino=Madrid], codigo=BA401, fecha=2023-06-04], Vuelo [Trayecto=Trayecto[origen=New York, destino=Madrid], codigo=AA701, fecha=2023-06-07], Vuelo [Trayecto=Trayecto[origen=Paris, destino=Madrid], codigo=AF301, fecha=2023-06-03], Vuelo [Trayecto=Trayecto[origen=Valencia, destino=Madrid], codigo=RY201, fecha=2023-06-12], Vuelo [Trayecto=Trayecto[origen=Milan, destino=Madrid], codigo=AZ801, fecha=2023-06-08], Vuelo [Trayecto=Trayecto[origen=Amsterdam, destino=Madrid], codigo=KL501, fecha=2023-06-05], Vuelo [Trayecto=Trayecto[origen=Frankfurt, destino=Madrid], codigo=LH601, fecha=2023-06-06], Vuelo [Trayecto=Trayecto[origen=Rome, destino=Madrid], codigo=VY1001, fecha=2023-06-10], Vuelo [Trayecto=Trayecto[origen=Barcelona, destino=Madrid], codigo=IB101, fecha=2023-06-11], Vuelo [Trayecto=Trayecto[origen=Paris, destino=Madrid], codigo=KL301, fecha=2023-06-13], Vuelo [Trayecto=Trayecto[origen=Valencia, destino=Madrid], codigo=RY201, fecha=2023-06-02]]
		London=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=London], codigo=BA400, fecha=2023-06-13], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=London], codigo=BA400, fecha=2023-06-03]]
		Paris=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Paris], codigo=AF300, fecha=2023-06-02], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Paris], codigo=KL300, fecha=2023-06-12]]
		Valencia=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Valencia], codigo=RY200, fecha=2023-06-11], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Valencia], codigo=RY200, fecha=2023-06-01]]

===testGetNumVuelosPorFecha ==========
	 El número de vuelos por fecha es 
		2023-06-13=2
		2023-06-12=2
		2023-06-11=2
		2023-06-10=2
		2023-06-09=2
		2023-06-08=2
		2023-06-07=2
		2023-06-06=2
		2023-06-05=2
		2023-06-04=2
		2023-06-03=2
		2023-06-02=2
		2023-06-01=3

===testGetNumPlazasPorDestino ==========
	 El número de plazas por destino es 
		Munich=50
		New York=30
		Frankfurt=50
		Rome=90
		Milan=70
		Amsterdam=60
		Barcelona=280
		Madrid=1090
		London=160
		Paris=180
		Valencia=180

===testGetPrecioMedioPorDestino ==========
	 El precio medio por destino es 
		Munich=105.25
		New York=350.5
		Frankfurt=110.0
		Rome=85.0
		Milan=90.0
		Amsterdam=95.25
		Barcelona=55.75
		Madrid=109.40384615384616
		London=150.75
		Paris=120.0
		Valencia=45.25

===testGetFechasPorDestino ==========
	 Las fechas por destino son
		Munich=[2023-06-08]
		New York=[2023-06-06]
		Frankfurt=[2023-06-05]
		Rome=[2023-06-09]
		Milan=[2023-06-07]
		Amsterdam=[2023-06-04]
		Barcelona=[2023-06-10, 2023-06-01]
		Madrid=[2023-06-13, 2023-06-12, 2023-06-11, 2023-06-10, 2023-06-09, 2023-06-08, 2023-06-07, 2023-06-06, 2023-06-05, 2023-06-04, 2023-06-03, 2023-06-02, 2023-06-01]
		London=[2023-06-13, 2023-06-03]
		Paris=[2023-06-12, 2023-06-02]
		Valencia=[2023-06-11, 2023-06-01]
```