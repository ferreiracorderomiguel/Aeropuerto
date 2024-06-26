package aeropuerto.test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import aeropuerto.FactoriaVuelos;
import aeropuerto.Vuelo;
import aeropuerto.Vuelos;
import aeropuerto.VuelosRepaso;

public class TestVuelos {

	public static void main(String[] args) {
		List<Vuelo> listaVuelos = FactoriaVuelos.leeVuelos("data/aeropuerto.csv");

		Vuelos vuelos = new Vuelos("Contenedor vuelos", listaVuelos);

		// testBloque4(vuelos);
		// testBloque5(vuelos);
		// testBloque6(vuelos);
		// testBloque7(vuelos);
		testBloque8(vuelos);
	}

	

	private static void testBloque4(VuelosRepaso vuelos) {
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
		Map<String, Set<LocalDate>> fechasDestino = vuelos.getFechasPorDestino();

		for (Map.Entry<String, Set<LocalDate>> entry : fechasDestino.entrySet()) {
			String destino = entry.getKey();
			Set<LocalDate> fechas = entry.getValue();

			System.out.println("\t\t" + destino + "= " + fechas);
		}
	}

	private static void testBloque6(Vuelos vuelos) {
		System.out.println("BLOQUE 6");

		// EJ 1
		System.out
				.println("\n===testGetVueloMasBaratoPorDestino1 ==========" + "\n\tEl vuelo más barato por destino es");
		Map<String, Optional<Vuelo>> vueloBaratoPorDestino1 = vuelos.getVueloMasBaratoPorDestino1();

		for (Map.Entry<String, Optional<Vuelo>> entry : vueloBaratoPorDestino1.entrySet()) {
			String destino = entry.getKey();
			Optional<Vuelo> vuelo = entry.getValue();

			System.out.println("\t\t" + destino + "= " + vuelo);

		}

		// EJ 2
		System.out
				.println("\n===testGetVueloMasBaratoPorDestino2 ==========" + "\n\tEl vuelo más barato por destino es");
		Map<String, Vuelo> vueloBaratoPorDestino2 = vuelos.getVueloMasBaratoPorDestino2();

		for (Map.Entry<String, Vuelo> entry : vueloBaratoPorDestino2.entrySet()) {
			String destino = entry.getKey();
			Vuelo vuelo = entry.getValue();

			System.out.println("\t\t" + destino + "= " + vuelo);

		}

		// EJ 3
		System.out.println(
				"\n===testGetCodigoVueloMasBaratoPorDestino ==========" + "\n\tEl vuelo más barato por destino es");
		Map<String, String> codigoVueloMasBaratoPorDestino = vuelos.getCodigoVueloMasBaratoPorDestino();

		for (Map.Entry<String, String> entry : codigoVueloMasBaratoPorDestino.entrySet()) {
			String destino = entry.getKey();
			String codigo = entry.getValue();

			System.out.println("\t\t" + destino + "= " + codigo);

		}

		// EJ 4
		System.out.println("\n===testGetDestinoMasVuelos ==========" + "\n\tEl destino con más vuelos es "
				+ vuelos.getDestinoMasVuelos());

		// EJ 5
		System.out.println("\n===testGetSegundoDestinoMasVuelos =========="
				+ "\n\tEl segundo destino con más vuelos es " + vuelos.getSegundoDestinoMasVuelos());

		// EJ 6
		System.out.println("\n===testGetNumPlazasPorDestino ==========" + "\n\tEl número de plazas por destino es");
		Map<String, Integer> numPlazasDestino = vuelos.getNumPlazasPorDestino6();

		for (Map.Entry<String, Integer> entry : numPlazasDestino.entrySet()) {
			String destino = entry.getKey();
			Integer numPLazas = entry.getValue();

			System.out.println("\t\t" + destino + "= " + numPLazas);

		}

		// EJ 7
		System.out.println(
				"\n===testGetPorcentajePlazasPorDestino ==========" + "\n\tEl porcentaje de plazas por destino es");
		Map<String, Double> porcentajePlazasDestino = vuelos.getPorcentajePlazasPorDestino();

		for (Map.Entry<String, Double> entry : porcentajePlazasDestino.entrySet()) {
			String destino = entry.getKey();
			Double porcentaje = entry.getValue();

			System.out.println("\t\t" + destino + "= " + porcentaje);

		}

		// EJ 8
		System.out.println("\n===testGetVueloMasBaratoPorDestino =========="
				+ "\n\tEl vuelo más barato por destino es");
		Map<String, Vuelo> vueloBaratoDestino = vuelos.getVueloMasBaratoPorDestino();

		for (Map.Entry<String, Vuelo> entry : vueloBaratoDestino.entrySet()) {
			String destino = entry.getKey();
			Vuelo v = entry.getValue();

			System.out.println("\t\t" + destino + "= " + v);

		}

		// EJ 9
		System.out.println("\n===testGetNumPasajerosPorDestinoDeAnyo =========="
				+ "\n\tEl numero de pasajeros por destino en el año 2023 es");
		Map<String, Integer> pasajerosDestinoAnyo = vuelos.getNumPasajerosPorDestinoDeAnyo(2023);

		for (Map.Entry<String, Integer> entry : pasajerosDestinoAnyo.entrySet()) {
			String destino = entry.getKey();
			Integer num = entry.getValue();

			System.out.println("\t\t" + destino + "= " + num);

		}
	}

	private static void testBloque7(Vuelos vuelos) {
		System.out.println("BLOQUE 6");
		
		System.out.println("\nEJERCICIO 01=======================\r\n"
				+ "===testDuracionTotalVuelosDestino ==========");
		System.out.println("La duración total de los vuelos al destino Madrid es " + vuelos.getDuracionTotalVuelosDestino("Madrid"));
		
		System.out.println("\nEJERCICIO 02=======================\r\n"
				+ "===testMuestraPrecioMedioDestino ==========");
		vuelos.muestraPrecioMedioDestino("Madrid");
		
		System.out.println("\nEJERCICIO 03=======================\r\n"
				+ "===testSubePreciosVuelosDestino ==========");
		System.out.println("Los precios al destino Madrid antes de la subida del 5,00 son:");
		vuelos.muestraPrecioMedioDestino("Madrid");
		vuelos.subePreciosVuelosDestino("Madrid", 5.00);
		
		System.out.println("\nEJERCICIO 05=======================\r\n"
				+ "===testGetCodigoVueloMenosOcupadoPorFecha ==========");
		
		for (Map.Entry<LocalDate, String> entry : vuelos.getCodigoVueloMenosOcupadoPorFecha().entrySet()) {
		    System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		System.out.println("\nEJERCICIO 06=======================\r\n"
				+ "===testGetFechasOrdenadasPorOcupacion ==========");
		System.out.println(vuelos.getFechasOrdenadasPorOcupacion());
		
		System.out.println("\nEJERCICIO 07=======================\r\n"
				+ "===testGetCodigosVuelosRecaudacionMayor ==========");
		System.out.println("Los códigos de los vuelos con recaudación superior a  300,00 ");
		System.out.println(vuelos.getCodigosVuelosRecaudacionMayor(300.0));
		
		
		System.out.println("\nEJERCICIO 08=======================\r\n"
				+ "===testGetCodigoVuelosOrdenadosPorPasajerosPorFecha ==========");
		System.out.println("Los códigos de los vuelos más baratos por fecha (ordenados por pasajeros) son");
		for(Map.Entry<LocalDate, List<String>> m: vuelos.getCodigoVuelosOrdenadosPorPasajerosPorFecha().entrySet()) {
			System.out.println(m.getKey() + "=" + m.getValue());
		}
	}
	
	private static void testBloque8(Vuelos vuelos) {
		// TODO Auto-generated method stub
		
	}
}