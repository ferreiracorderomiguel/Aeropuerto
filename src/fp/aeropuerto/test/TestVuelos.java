package aeropuerto.test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import aeropuerto.FactoriaVuelos;
import aeropuerto.Vuelo;
import aeropuerto.Vuelos;

public class TestVuelos {

	public static void main(String[] args) {
		List<Vuelo> listaVuelos = FactoriaVuelos.leeVuelos("data/aeropuerto.csv");

		Vuelos vuelos = new Vuelos("Contenedor vuelos", listaVuelos);

		// testBloque4(vuelos);
		// testBloque5(vuelos);
		// testBloque6(vuelos);
	}

	private static void testBloque4(Vuelos vuelos) {
		System.out.println("BLOQUE 4");
		// EJ 1
		System.out.println("===testExisteVueloDestino ==========\n"
				+ "\t¿Hay algún vuelo con destino Madrid pasajeros? " + vuelos.exiteAlgunVuelo("Madrid") + "\n");

		// EJ 2
		System.out.println("===testTodosVuelosAlMenosNPasajeros ==========\n"
				+ "\t¿Tienen todos al menos 100 pasajeros? " + vuelos.compruebaNPasajeros(100) + "\n");

		// EJ 3
		System.out.println("===testGetNumVuelosFecha ==========\n" + "\tHay "
				+ vuelos.cuantosVuelosEseDia(LocalDate.parse("2023-06-04")) + " vuelos en la fecha 2023-06-04.\n");

		// EJ 4
		System.out.println("===testGetVuelosPosteriores ==========\n" + "\tLos vuelos posteriores a 2023-06-04 son");

		for (Vuelo v : vuelos.listaVuelosPosteriores(LocalDate.parse("2023-06-04"))) {
			System.out.println("\t\t" + v);
		}

		// EJ 5
		System.out.println("===testGetVuelosAnteriores ==========\n" + "\tLos vuelos anteriores a 2023-06-04 son");

		for (String s : vuelos.conjuntoDestinosAnteriores(LocalDate.parse("2023-06-04"))) {
			System.out.println("\t\t" + s);
		}

		// EJ 6
		Set<String> ciudades = new HashSet<>(Arrays.asList("Madrid", "Barcelona"));
		System.out.println("===testGetNumPasajerosConDestinos ==========\n" + "\tHay "
				+ vuelos.numPasajerosEnDestinos(ciudades) + " pasajeros para los destinos [Madrid, Barcelona].\n");

		// EJ 7
		System.out.println("===testGetPrecioMedioVuelosMes ==========\n"
				+ "\tEl precio medio de los vuelos en el mes 6 es " + vuelos.precioMedioMes(6) + "\n");

		// EJ 8
		System.out.println("===testGetRecaudacion ==========\n" + "\tLa recaudación de los vuelos en el año 2023 es "
				+ vuelos.getRecaudacion(2023) + "\n");

		// EJ 9
		System.out.println("===testGetVueloMasPasajeros ==========\n" + "\tEl vuelo con más pasajeros es "
				+ vuelos.getVueloMasPasajeros() + "\n");

		// EJ 10
		System.out.println(
				"===testGetCodigoVueloMenorPrecio ==========\n" + "\tEl vuelo con destino Madrid con menor precio es "
						+ vuelos.getCodigoVueloMenorPrecio("Madrid") + "\n");

		// EJ 11
		System.out.println("===testGetNVuelosMasBaratos ==========\n" + "\tLos 5 vuelos más baratos son");

		for (Vuelo v : vuelos.getNVuelosMasBaratos(5)) {
			System.out.println("\t\t" + v);
		}

		// EJ 12
		System.out.println("===testGetNVuelosMasDuracion ==========\n" + "\tLos 5 vuelos con más duración son");

		for (Vuelo v : vuelos.getNVuelosMasDuracion(5)) {
			System.out.println("\t\t" + v);
		}
	}

	private static void testBloque5(Vuelos vuelos) {
		System.out.println("BLOQUE 5");
		// EJ 1
		System.out.println("===testGetNumDestinosDiferentesFecha ==========\n" + "\tHay "
				+ vuelos.getNumDestinosDiferentesFecha(LocalDate.parse("2023-06-04"))
				+ " destinos distintos en la fecha 2023-06-04\n");

		// EJ 2
		System.out.println("===testGetVuelosOrdenados ==========\n" + "\tLos 5 vuelos más baratos son");

		for (Vuelo v : vuelos.getVuelosOrdenados()) {
			System.out.println("\t\t" + v);
		}

		// EJ 3
		System.out.println("\n===testGetDestinosOrdenados ==========\n" + "\tLos destinos ordenados son");

		for (String s : vuelos.getDestinosOrdenados("B")) {
			System.out.println("\t\t" + s);
		}

		// EJ 4
		System.out.println(
				"\n===testGetDestinosOrdenadosPorLongitud ==========\n" + "\tLos destinos ordenados por destino son");

		for (String s : vuelos.getDestinosOrdenadosPorLongitud()) {
			System.out.println("\t\t" + s);
		}

		// EJ 5a
		System.out.println("===testGetNumVuelosFecha ==========\n" + "\tHay "
				+ vuelos.getNumVuelosFecha(LocalDate.parse("2023-06-04")) + " vuelos en la fecha 2023-06-04\n");

		// EJ 5b
		System.out.println("===testGetPrecioMedioVuelosMes ==========\n"
				+ "\tEl precio medio de los vuelos en el mes 6 es " + vuelos.getPrecioMedioVuelosMes(6) + "\n");

		// EJ 5c
		System.out.println("===testGetRecaudacion ==========\n" + "\tLa recaudación de los vuelos en el año 2023 es "
				+ vuelos.getRecaudacionCollect(2023) + "\n");

		// EJ 5d
		System.out.println("===testGetVueloMasPasajeros ==========\n" + "\tEl vuelo con más pasajeros es Vuelo "
				+ vuelos.getVueloMasPasajerosCollect() + "\n");

		// EJ 5.1
		System.out.println("===testGetVuelosPorFecha ==========\n" + "\tLos vuelos por fecha son");

		Map<LocalDate, List<Vuelo>> vuelosPorFecha = vuelos.getVuelosPorFecha();

		for (Map.Entry<LocalDate, List<Vuelo>> entry : vuelosPorFecha.entrySet()) {
			LocalDate fecha = entry.getKey();
			List<Vuelo> vuelosEnFecha = entry.getValue();

			for (Vuelo v : vuelosEnFecha) {
				System.out.println("\t\t" + fecha + "= " + v);
			}
		}

		// EJ 5.2
		System.out.println("===testGetConjuntoVuelosFecha ==========\n" + "\tLos vuelos por fecha son");
		Map<LocalDate, Set<Vuelo>> conuntoVuelosPorFecha = vuelos.getConjuntoVuelosFecha();

		for (Map.Entry<LocalDate, Set<Vuelo>> entry : conuntoVuelosPorFecha.entrySet()) {
			LocalDate fecha = entry.getKey();
			Set<Vuelo> vuelosEnFecha = entry.getValue();

			for (Vuelo v : vuelosEnFecha) {
				System.out.println("\t\t" + fecha + "= " + v);
			}
		}

		// EJ 5.3
		System.out.println("===testGetNumVuelosPorFecha ==========\n" + "\tEl número de vuelos por fecha es");
		Map<LocalDate, Long> numVuelosPorFecha = vuelos.getNumVuelosPorFecha();

		for (Map.Entry<LocalDate, Long> entry : numVuelosPorFecha.entrySet()) {
			LocalDate fecha = entry.getKey();
			Long numVuelosEnFecha = entry.getValue();

			System.out.println("\t\t" + fecha + "= " + numVuelosEnFecha);

		}

		// EJ 5.4
		System.out.println("===testGetNumPlazasPorDestino ==========\n" + "\tEl número de plazas por destino es");
		Map<String, Integer> numPlazasPorDestino = vuelos.getNumPlazasPorDestino();

		for (Map.Entry<String, Integer> entry : numPlazasPorDestino.entrySet()) {
			String destino = entry.getKey();
			Integer plazas = entry.getValue();

			System.out.println("\t\t" + destino + "= " + plazas);

		}

		// EJ 5.5
		System.out.println("===testGetPrecioMedioPorDestino ==========\n" + "\tEl precio medio por destino es");
		Map<String, Double> precioMedioDestino = vuelos.getPrecioMedioPorDestino();

		for (Map.Entry<String, Double> entry : precioMedioDestino.entrySet()) {
			String destino = entry.getKey();
			Double plazas = entry.getValue();

			System.out.println("\t\t" + destino + "= " + plazas);

		}

		// EJ 5.6
		System.out.println("===testGetFechasPorDestino ==========\n" + "\tLas fechas por destino es");
		Map<String, Set<LocalDate>> fechasDestino = vuelos.getFechasPorDestino ();

		for (Map.Entry<String, Set<LocalDate>> entry : fechasDestino.entrySet()) {
			String destino = entry.getKey();
			Set<LocalDate> fechas = entry.getValue();

			System.out.println("\t\t" + destino + "= " + fechas);
		}
	}

	private static void testBloque6(Vuelos vuelos) {
		System.out.println("BLOQUE 6");

	}
}