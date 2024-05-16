# Fundamentos de Programación
# Ejercicio de teoría: Vuelos - Bloque 08 - Tratamientos secuenciales

**Autor:** José C. Riquelme 
**Revisores:**  Toñi Reina. 
**Última modificación:** 13/05/2023.

# **1 Objetivos**

El objetivo de este bloque es trabajar con tratamientos secuenciales con varios pasos y *collectors* para crear Maps de nivel medio/alto de dificultad.


## EJERCICIOS

En el tipo contenedor **VuelosB8** añada las siguientes operaciones e impleméntelas exclusivamente con *stream*.


1.	Implemente un método que devuelva un Map que relacione cada destino con una lista de tres elementos: el mínimo, la media y el máximo de los precios de los vuelos a ese destino

2.	Implemente un método que devuelva un Map en el que a cada destino le haga corresponder un Boolean que sea True si todos los vuelos a ese destino tienen plazas libres y False en caso contrario.   

3.	Implemente un método que dado un número n, devuelva una lista con los n identificadores de pilotos y copilotos con mayor número de vuelos.

4.	Implemente un método que dados un origen y un destino devuelva True si hay un vuelo directo o con una sola escala entre ambas ciudades.

5. Implemente un método que devuelva un Map en el que a cada origen le hace corresponder un conjunto con los tripulantes de los vuelos con ese origen.

6. Implemente un método que devuelva un Map en el que a cada tripulante le haga corresponder un conjunto con los orígenes de los vuelos donde han estado esos tripulantes. Implemente este método con bucles.

Los resultados esparados para el dataset proporcionado son:

```
EJERCICIO 01=======================

===testGetResumenPreciosDestino ==========
Munich=[105.25, 105.25, 105.25]
New York=[350.5, 350.5, 350.5]
Frankfurt=[110.0, 110.0, 110.0]
Rome=[85.0, 85.0, 85.0]
Milan=[90.0, 90.0, 90.0]
Amsterdam=[95.25, 95.25, 95.25]
Barcelona=[55.75, 55.75, 55.75]
Madrid=[50.0, 109.40384615384616, 375.0]
London=[150.75, 150.75, 150.75]
Paris=[120.0, 120.0, 120.0]
Valencia=[45.25, 45.25, 45.25]

EJERCICIO 02=======================

===testGetTienenTodosPlazasLibresPorDestino ==========
Munich=true
New York=true
Frankfurt=true
Rome=true
Milan=true
Amsterdam=false
Barcelona=true
Madrid=false
London=true
Paris=true
Valencia=false

EJERCICIO 03=======================

===testGetPilotosMasFrecuentesOrdenados ==========
	 n=10
[CP0006, PP0003, CP0004, PP0005, PP0004, CP0005, CP0003, PP0001, PP0002, PP0007]

EJERCICIO 04=======================

===testHayConexion ==========
	 origen=London destino=Valencia
true

===testHayConexion ==========
	 origen=London destino=Valencia
true

===testHayConexion ==========
	 origen=London destino=Moscu
false

EJERCICIO 05=======================

===testGetTripulantesPorOrigen ==========
Munich=[CP0005, AV0007, AV0018, AV0015, PP0004, AV0016, AV0012]
New York=[AV0008, CP0004, AV0009, PP0004, AV0027]
Frankfurt=[AV0019, PP0003, CP0004, AV0011, AV0012, AV0020]
Rome=[CP0006, PP0003, AV0014, AV0023]
Milan=[CP0005, AV0019, AV0018, PP0004, AV0006, AV0017, AV0020]
Amsterdam=[CP0003, PP0006, AV0005, AV0002, AV0024, AV0001, AV0012]
Barcelona=[AV0007, CP0006, PP0003, CP0004, AV0015, PP0005, AV0014, AV0006, AV0022, AV0013, AV0001, AV0012]
Madrid=[PP0001, AV0008, AV0007, PP0003, PP0002, AV0009, AV0026, AV0004, PP0005, AV0103, AV0025, AV0003, PP0004, AV0102, PP0007, AV0028, AV0006, AV0005, PP0006, AV0104, AV0022, AV0021, AV0002, AV0101, AV0023, AV0020, AV0019, CP0005, CP0006, AV0018, CP0003, CP0004, AV0015, AV0014, CP0007, AV0017, AV0016, AV0011, AV0010, AV0013, AV0012, CP0002]
London=[CP0006, CP0003, PP0003, PP0002, AV0004, AV0015, AV0014, AV0025, AV0006, AV0022, AV0013, AV0023]
Paris=[AV0008, AV0009, AV0015, PP0004, AV0014, AV0017, PP0007, CP0008, AV0021, AV0001, CP0002]
Valencia=[AV0008, AV0019, AV0009, PP0005, AV0017, CP0008, AV0016, AV0011, AV0022, AV0010, CP0002]

EJERCICIO 06=======================

===testGetOrigenesPorTripulante ==========
PP0001=[Barcelona, Valencia]
AV0008=[Rome, Madrid]
AV0007=[Amsterdam, Madrid, London]
PP0003=[Frankfurt, Amsterdam, Madrid]
PP0002=[Milan, Madrid, London]
AV0009=[Rome, Madrid]
AV0026=[Barcelona]
PP0005=[Munich, Rome, Madrid]
AV0004=[Frankfurt, Madrid]
AV0103=[Paris]
AV0025=[Barcelona, Madrid, Valencia]
PP0004=[New York, Madrid]
AV0003=[New York, Frankfurt, Valencia]
AV0102=[Paris]
AV0006=[Amsterdam, Barcelona, Madrid]
PP0007=[Barcelona, Madrid, Paris]
AV0028=[London]
PP0006=[Madrid, Paris]
AV0005=[New York, Barcelona, Madrid]
AV0027=[Madrid]
AV0104=[Paris]
AV0022=[Munich, Madrid]
AV0021=[Frankfurt, Rome, Madrid, London, Paris]
AV0002=[Milan, Madrid]
AV0024=[Madrid]
AV0101=[Paris]
AV0023=[Milan, Madrid, London]
AV0001=[Madrid]
AV0020=[Munich, Madrid, Paris]
AV0019=[Munich, Madrid, Paris]
CP0005=[New York, Madrid, Paris]
CP0006=[Milan, Rome, Barcelona, Madrid]
AV0018=[Barcelona, Madrid]
CP0003=[Madrid, London, Valencia]
CP0004=[Frankfurt, Amsterdam, Madrid, Paris]
AV0015=[Frankfurt, Amsterdam, Madrid]
AV0014=[New York, Barcelona, Madrid, Valencia]
AV0017=[Barcelona, Madrid]
CP0007=[Munich, Valencia]
AV0016=[Frankfurt, Madrid, Valencia]
CP0008=[Madrid]
AV0011=[New York, Munich, Milan, Madrid, Valencia]
AV0010=[Rome, Madrid]
AV0013=[Barcelona, Madrid]
AV0012=[New York, Madrid]
CP0002=[Barcelona, Madrid]
```
