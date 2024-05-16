# Fundamentos de Programación
# Ejercicio de teoría: Vuelos - Bloque 07 - Tratamientos secuenciales

**Autor:** José C. Riquelme 
**Revisores:**  Toñi Reina. 
**Última modificación:** 12/05/2023.

# **1 Objetivos**

El objetivo de este bloque es trabajar con tratamientos secuenciales con varios pasos y *collectors* para crear Maps de nivel medio/alto de dificultad.


## EJERCICIOS

En el tipo contenedor **VuelosB7** añada las siguientes operaciones e impleméntelas exclusivamente con *stream*.


1.	Dado un destino implemente un método que devuelva un objeto de tipo Duration con el acumulado de las duraciones de los vuelos a ese destino.

2.	Dado un destino implemente un método que muestre en la consola los precios de los vuelos a ese destino ordenados por fecha.   

3.	Dados un destino y un porcentaje, implemente un método que incremente todos los precios de los vuelos a ese destino un en el porcentaje dado como parámetro. Compruebe el cambio en el test, invocando al método del apartado 2 invocándolo antes y después de invocar al método.

4.	Dado el nombre de un fichero implemente un método que escriba en ese fichero los precios medios de los vuelos por destino, ordenados por orden alfabético de destino.

5.	Implemente un método que devuelva un SortedMap donde las claves son las fechas de los vuelos y los valores el código del vuelo de ese día con menor tasa de ocupación.

6.	Implemente un método que devuelva una lista con las fechas de los vuelos, ordenadas por porcentaje de viajeros de cada día con respecto al total de pasajeros.

7.	Dado un umbral de recaudación implemente un método que devuelva una lista con los códigos de los vuelos cuya recaudación es superior a la dada como parámetro.

8.	Implemente un método que devuelva un Map tal que a cada fecha le haga corresponder una lista ordenada de los códigos de los vuelos en esa fecha. La lista con los código de los vuelos debe estar ordenada de mayor a menor número de pasajeros.

Los resultados esperados para el dataset proporcionado son:

```
EJERCICIO 01=======================
===testDuracionTotalVuelosDestino ==========
	 La duración total de los vuelos al destino Madrid es PT30H45M

EJERCICIO 02=======================
===testMuestraPrecioMedioDestino ==========
Los precios medios al destino Madrid son
65.5
50.0
110.5
135.25
85.5
105.0
375.0
80.75
98.5
90.25
65.5
50.0
110.5

EJERCICIO 03=======================
===testSubePreciosVuelosDestino ==========
	 Los precios al destino Madrid antes de la subida del 5,00 son:
65.5
50.0
110.5
135.25
85.5
105.0
375.0
80.75
98.5
90.25
65.5
50.0
110.5
	 Los precios al destino Madrid tras la subida del 5,00 son:
68.775
52.5
116.025
142.01250000000002
89.775
110.25
393.75
84.78750000000001
103.42500000000001
94.7625
68.775
52.5
116.025

EJERCICIO 04=======================
===testEscribeDestinos ==========
	 Escribiendo destinos en out/destinos.txt

EJERCICIO 05=======================
===testGetCodigoVueloMenosOcupadoPorFecha ==========
	 Los vuelos menos ocupados por fecha son
		2023-06-01=IB100
		2023-06-02=AF300
		2023-06-03=BA400
		2023-06-04=BA401
		2023-06-05=LH600
		2023-06-06=AA700
		2023-06-07=AA701
		2023-06-08=EW900
		2023-06-09=VY1000
		2023-06-10=IB100
		2023-06-11=IB101
		2023-06-12=KL300
		2023-06-13=BA400

EJERCICIO 06=======================
===testGetFechasOrdenadasPorOcupacion ==========
	 Las fechas ordenadas por ocupación son
	[2023-06-01, 2023-06-11, 2023-06-12, 2023-06-10, 2023-06-02, 2023-06-13, 2023-06-03, 2023-06-04, 2023-06-09, 2023-06-08, 2023-06-05, 2023-06-07, 2023-06-06]

EJERCICIO 07=======================
===testGetCodigosVuelosRecaudacionMayor ==========
	 Los códigos de los vuelos con recaudación superior a  300,00 son
	[RY201, AZ800, AA700, RY200, AA701, LH600, LH601, KL500, KL501, EW900, BA400, KL300, BA401, KL301, AF300, IB101, AF301, IB100, EW901, AZ801, VY1001, VY1000]

EJERCICIO 08=======================
===testGetCodigoVuelosOrdenadosPorPasajerosPorFecha ==========
	 Los códigos de los vuelos más baratos por fecha (ordenados por pasajeros) son
		2023-06-13=[KL301, BA400]
		2023-06-12=[RY201, KL300]
		2023-06-11=[IB101, RY200]
		2023-06-10=[IB100, VY1001]
		2023-06-09=[VY1000, EW901]
		2023-06-08=[AZ801, EW900]
		2023-06-07=[AZ800, AA701]
		2023-06-06=[LH601, AA700]
		2023-06-05=[KL501, LH600]
		2023-06-04=[BA401, KL500]
		2023-06-03=[AF301, BA400]
		2023-06-02=[RY201, AF300]
		2023-06-01=[IB101, RY200, IB100]
```

El archivo generado por el método ```escribeDestinos```debe tener el siguiente contenido:

```
Amsterdam->95.25
Barcelona->55.75
Frankfurt->110.0
London->150.75
Madrid->109.45854807692308
Milan->90.0
Munich->105.25
New York->350.5
Paris->120.0
Rome->85.0
Valencia->45.25
```