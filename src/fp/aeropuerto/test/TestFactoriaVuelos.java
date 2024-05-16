package aeropuerto.test;

import java.util.List;

import aeropuerto.FactoriaVuelos;
import aeropuerto.Vuelo;

public class TestFactoriaVuelos {
    public static void main(String []args) {
	
		List<Vuelo> vuelos = FactoriaVuelos.leeVuelos("data/aeropuerto.csv");
		vuelos.stream()
			.forEach(System.out::println);
		String msg = String.format("Se han leido %d vuelos", vuelos.size());
		System.out.println(msg);
			
				
	}
}
