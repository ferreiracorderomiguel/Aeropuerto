# Fundamentos de Programación
# Ejercicio de teoría: Vuelos - Bloque 06 - Tratamientos secuenciales

**Autor:** José C. Riquelme 
**Revisores:**  Toñi Reina. 
**Última modificación:** 19/04/2022.

# **1 Objetivos**

El objetivo de este bloque es trabajar con tratamientos secuenciales con varios pasos y *collectors* para crear Maps de nivel medio de dificultad.


## EJERCICIOS

En el tipo contenedor **VuelosB6** añada las siguientes operaciones e impleméntelas exclusivamente con *stream*.


1.	Método que devuelve un Map tal que a cada destino le hace corresponder un Optional<Vuelo> con el vuelo más barato a ese destino.

2.	Método que devuelve un Map tal que a cada destino le hace corresponder un Vuelo con el vuelo más barato a ese destino.

3.	Método que devuelve un Map tal que a cada destino le hace corresponder el código del Vuelo con el vuelo más barato a ese destino.

4.	Método que devuelve el destino con más vuelos. Si no se puede calcular eleva NoSuchElementException.

5.	Método que devuelve cuál es el segundo destino con más vuelos. Si no se puede calcular eleva NoSuchElementException.

6.	Método que haga corresponder a cada destino el número total de plazas de los vuelos a ese destino. Usa ```Collectors.toMap``` para resolverlo.

7.	Método que devuelve un Map que a cada destino le haga corresponder el porcentaje de plazas de los vuelos a ese destino con respecto al total de plazas.

8.	Método que haga corresponder a cada destino el vuelo más barato a ese destino.  Usa ```Collectors.toMap``` para resolverlo.

9.	Método que dado un entero que representa un año devuelve un SortedMap que relacione cada destino con el total de pasajeros a ese destino en el año dado como parámetro.

10.	Método que devuelve un Map tal que dado un entero n haga corresponder a cada fecha la lista de los n destinos distintos de los vuelos de mayor duración.
		
11.	Método que devuelve un Map que a cada fecha le haga corresponder una lista de vuelos ordenada por precio.

12.	Método que dado un número entero n devuelve un conjunto con los destinos que están entre los n destinos con más vuelos.

Los resultados esperados para el dataset proporcionado son:

```
EJERCICIO1=======================

===testGetVueloMasBaratoPorDestino1 ==========
	 El vuelo más barato por destino es
		Munich=Optional[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Munich], codigo=EW900, fecha=2023-06-08]]
		New York=Optional[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=New York], codigo=AA700, fecha=2023-06-06]]
		Frankfurt=Optional[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Frankfurt], codigo=LH600, fecha=2023-06-05]]
		Rome=Optional[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Rome], codigo=VY1000, fecha=2023-06-09]]
		Milan=Optional[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Milan], codigo=AZ800, fecha=2023-06-07]]
		Amsterdam=Optional[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Amsterdam], codigo=KL500, fecha=2023-06-04]]
		Barcelona=Optional[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Barcelona], codigo=IB100, fecha=2023-06-01]]
		Madrid=Optional[Vuelo [Trayecto=Trayecto[origen=Valencia, destino=Madrid], codigo=RY201, fecha=2023-06-02]]
		London=Optional[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=London], codigo=BA400, fecha=2023-06-03]]
		Paris=Optional[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Paris], codigo=AF300, fecha=2023-06-02]]
		Valencia=Optional[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Valencia], codigo=RY200, fecha=2023-06-01]]
EJERCICIO 01=======================

===testGetVueloMasBaratoPorDestino1 ==========
	 El vuelo más barato por destino es
		Munich=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Munich], codigo=EW900, fecha=2023-06-08]
		New York=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=New York], codigo=AA700, fecha=2023-06-06]
		Frankfurt=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Frankfurt], codigo=LH600, fecha=2023-06-05]
		Rome=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Rome], codigo=VY1000, fecha=2023-06-09]
		Milan=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Milan], codigo=AZ800, fecha=2023-06-07]
		Amsterdam=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Amsterdam], codigo=KL500, fecha=2023-06-04]
		Barcelona=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Barcelona], codigo=IB100, fecha=2023-06-01]
		Madrid=Vuelo [Trayecto=Trayecto[origen=Valencia, destino=Madrid], codigo=RY201, fecha=2023-06-02]
		London=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=London], codigo=BA400, fecha=2023-06-03]
		Paris=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Paris], codigo=AF300, fecha=2023-06-02]
		Valencia=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Valencia], codigo=RY200, fecha=2023-06-01]
EJERCICIO 02=======================

===testGetCodigoVueloMasBaratoPorDestino ==========
	 El código del vuelo más barato por destino es
		Munich=EW900
		New York=AA700
		Frankfurt=LH600
		Rome=VY1000
		Milan=AZ800
		Amsterdam=KL500
		Barcelona=IB100
		Madrid=RY201
		London=BA400
		Paris=AF300
		Valencia=RY200
EJERCICIO 03=======================

===testGetDestinoMasVuelos ==========
	 El destino con más vuelos es Madrid
EJERCICIO 04=======================

===testGetSegundoDestinoMasVuelos ==========
	 El segundo destino con más vuelos es Barcelona
EJERCICIO 05=======================

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
EJERCICIO 06=======================

===testGetPorcentajePlazasPorDestino ==========
	 El porcentaje de plazas por destino es
		Munich=2.232142857142857
		New York=1.3392857142857142
		Frankfurt=2.232142857142857
		Rome=4.017857142857143
		Milan=3.125
		Amsterdam=2.6785714285714284
		Barcelona=12.5
		Madrid=48.660714285714285
		London=7.142857142857143
		Paris=8.035714285714286
		Valencia=8.035714285714286
EJERCICIO 07=======================

===testGetVueloMasBaratoPorDestino ==========
	 El vuelo más barato por destino es
		Munich=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Munich], codigo=EW900, fecha=2023-06-08]
		New York=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=New York], codigo=AA700, fecha=2023-06-06]
		Frankfurt=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Frankfurt], codigo=LH600, fecha=2023-06-05]
		Rome=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Rome], codigo=VY1000, fecha=2023-06-09]
		Milan=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Milan], codigo=AZ800, fecha=2023-06-07]
		Amsterdam=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Amsterdam], codigo=KL500, fecha=2023-06-04]
		Barcelona=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Barcelona], codigo=IB100, fecha=2023-06-01]
		Madrid=Vuelo [Trayecto=Trayecto[origen=Valencia, destino=Madrid], codigo=RY201, fecha=2023-06-02]
		London=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=London], codigo=BA400, fecha=2023-06-03]
		Paris=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Paris], codigo=AF300, fecha=2023-06-02]
		Valencia=Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Valencia], codigo=RY200, fecha=2023-06-01]
EJERCICIO 08=======================

===testGetNumPasajerosPorDestinoDeAnyo ==========
	 El numero de pasajeros por destino en el año 2023 es
		Amsterdam=60
		Barcelona=198
		Frankfurt=45
		London=135
		Madrid=992
		Milan=60
		Munich=40
		New York=20
		Paris=165
		Rome=75
		Valencia=180
EJERCICIO 09=======================

===testGetNDestinosMayorDuracionPorFecha ==========
	 Los 3 destinos con vuelos de mayor duracion por fecha son
		2023-06-13=[London, Madrid]
		2023-06-12=[Paris, Madrid]
		2023-06-11=[Valencia, Madrid]
		2023-06-10=[Madrid, Barcelona]
		2023-06-09=[Rome, Madrid]
		2023-06-08=[Munich, Madrid]
		2023-06-07=[Madrid, Milan]
		2023-06-06=[New York, Madrid]
		2023-06-05=[Madrid, Frankfurt]
		2023-06-04=[Madrid, Amsterdam]
		2023-06-03=[London, Madrid]
		2023-06-02=[Paris, Madrid]
		2023-06-01=[Valencia, Barcelona, Madrid]
EJERCICIO 10=======================

===testGetDestinosOrdenadosPorPrecioPorFecha ==========
	 Los destinos ordenados por precio por fecha son
		2023-06-13=[Vuelo [Trayecto=Trayecto[origen=Paris, destino=Madrid], codigo=KL301, fecha=2023-06-13], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=London], codigo=BA400, fecha=2023-06-13]]
		2023-06-12=[Vuelo [Trayecto=Trayecto[origen=Valencia, destino=Madrid], codigo=RY201, fecha=2023-06-12], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Paris], codigo=KL300, fecha=2023-06-12]]
		2023-06-11=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Valencia], codigo=RY200, fecha=2023-06-11], Vuelo [Trayecto=Trayecto[origen=Barcelona, destino=Madrid], codigo=IB101, fecha=2023-06-11]]
		2023-06-10=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Barcelona], codigo=IB100, fecha=2023-06-10], Vuelo [Trayecto=Trayecto[origen=Rome, destino=Madrid], codigo=VY1001, fecha=2023-06-10]]
		2023-06-09=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Rome], codigo=VY1000, fecha=2023-06-09], Vuelo [Trayecto=Trayecto[origen=Munich, destino=Madrid], codigo=EW901, fecha=2023-06-09]]
		2023-06-08=[Vuelo [Trayecto=Trayecto[origen=Milan, destino=Madrid], codigo=AZ801, fecha=2023-06-08], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Munich], codigo=EW900, fecha=2023-06-08]]
		2023-06-07=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Milan], codigo=AZ800, fecha=2023-06-07], Vuelo [Trayecto=Trayecto[origen=New York, destino=Madrid], codigo=AA701, fecha=2023-06-07]]
		2023-06-06=[Vuelo [Trayecto=Trayecto[origen=Frankfurt, destino=Madrid], codigo=LH601, fecha=2023-06-06], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=New York], codigo=AA700, fecha=2023-06-06]]
		2023-06-05=[Vuelo [Trayecto=Trayecto[origen=Amsterdam, destino=Madrid], codigo=KL501, fecha=2023-06-05], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Frankfurt], codigo=LH600, fecha=2023-06-05]]
		2023-06-04=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Amsterdam], codigo=KL500, fecha=2023-06-04], Vuelo [Trayecto=Trayecto[origen=London, destino=Madrid], codigo=BA401, fecha=2023-06-04]]
		2023-06-03=[Vuelo [Trayecto=Trayecto[origen=Paris, destino=Madrid], codigo=AF301, fecha=2023-06-03], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=London], codigo=BA400, fecha=2023-06-03]]
		2023-06-02=[Vuelo [Trayecto=Trayecto[origen=Valencia, destino=Madrid], codigo=RY201, fecha=2023-06-02], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Paris], codigo=AF300, fecha=2023-06-02]]
		2023-06-01=[Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Valencia], codigo=RY200, fecha=2023-06-01], Vuelo [Trayecto=Trayecto[origen=Madrid, destino=Barcelona], codigo=IB100, fecha=2023-06-01], Vuelo [Trayecto=Trayecto[origen=Barcelona, destino=Madrid], codigo=IB101, fecha=2023-06-01]]
EJERCICIO 11=======================

===testGetNDestinosMasVuelos ==========
	 Los 3 destinos con más vuelos son [Barcelona, Madrid, London]
```