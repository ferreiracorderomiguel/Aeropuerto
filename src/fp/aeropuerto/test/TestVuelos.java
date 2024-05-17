package aeropuerto.test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import aeropuerto.FactoriaVuelos;
import aeropuerto.Vuelo;
import aeropuerto.Vuelos;

public class TestVuelos {

	public static void main(String[] args) {
		List<Vuelo> listaVuelos = FactoriaVuelos.leeVuelos("data/aeropuerto.csv");
		
		Vuelos vuelos = new Vuelos("Contenedor vuelos", listaVuelos);
		
		// Bloque 4
		// EJ 1
		System.out.println("===testExisteVueloDestino ==========\n"
				+ "\t¿Hay algún vuelo con destino Madrid pasajeros? " + vuelos.exiteAlgunVuelo("Madrid") + "\n");
		
		// EJ 2
		System.out.println("===testTodosVuelosAlMenosNPasajeros ==========\n"
				+ "\t¿Tienen todos al menos 100 pasajeros? " + vuelos.compruebaNPasajeros(100) + "\n");
		
		// EJ 3 
		System.out.println("===testGetNumVuelosFecha ==========\n"
				+ "\tHay " + vuelos.cuantosVuelosEseDia(LocalDate.parse("2023-06-04")) + " vuelos en la fecha 2023-06-04.\n");
		
		// EJ 4
		System.out.println("===testGetVuelosPosteriores ==========\n"
				+ "\tLos vuelos posteriores a 2023-06-04 son");
		
		for(Vuelo v: vuelos.listaVuelosPosteriores(LocalDate.parse("2023-06-04"))) {
			System.out.println("\t\t" + v);
		}
		
		// EJ 5
		System.out.println("===testGetVuelosAnteriores ==========\n"
				+ "\tLos vuelos anteriores a 2023-06-04 son");
		
		for(String s: vuelos.conjuntoDestinosAnteriores(LocalDate.parse("2023-06-04"))) {
			System.out.println("\t\t" + s);
		}
		
		// EJ 6
		Set<String> ciudades = new HashSet<>(Arrays.asList("Madrid", "Barcelona"));
		System.out.println("===testGetNumPasajerosConDestinos ==========\n"
				+ "\tHay " + vuelos.numPasajerosEnDestinos(ciudades) + " pasajeros para los destinos [Madrid, Barcelona].\n");
		
		// EJ 7
		System.out.println("===testGetPrecioMedioVuelosMes ==========\n"
				+ "\tEl precio medio de los vuelos en el mes 6 es " + vuelos.precioMedioMes(6) + "\n");
		
		// EJ 8
		System.out.println("===testGetRecaudacion ==========\n"
				+ "\tLa recaudación de los vuelos en el año 2023 es " + vuelos.getRecaudacion(2023) + "\n");
		
		// EJ 9
		System.out.println("===testGetVueloMasPasajeros ==========\n"
				+ "\tEl vuelo con más pasajeros es " + vuelos.getVueloMasPasajeros() + "\n");
		
		// EJ 10
		System.out.println("===testGetCodigoVueloMenorPrecio ==========\n"
				+ "\tEl vuelo con destino Madrid con menor precio es " + vuelos.getCodigoVueloMenorPrecio("Madrid") + "\n");
	
		// EJ 11
		System.out.println("===testGetNVuelosMasBaratos ==========\n"
				+ "\tLos 5 vuelos más baratos son");
		
		for(Vuelo v: vuelos.getNVuelosMasBaratos(5)) {
			System.out.println("\t\t" + v);
		}
		
		// EJ 12
		System.out.println("===testGetNVuelosMasDuracion ==========\n"
				+ "\tLos 5 vuelos con más duración son");
		
		for(Vuelo v: vuelos.getNVuelosMasDuracion(5)) {
			System.out.println("\t\t" + v);
		}
	}
}