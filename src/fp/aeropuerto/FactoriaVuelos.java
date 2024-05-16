package aeropuerto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import utiles.Checkers;

public class FactoriaVuelos {

	public static List<Vuelo> leeVuelos(String nomfich) {
		List<Vuelo> lv=null;
		try {
			  //Por defecto Files.lines trabaja en UTF-8
			  lv=Files.lines(Paths.get(nomfich))
					.skip(1)
					.map(FactoriaVuelos::parseaVuelo)
					.collect(Collectors.toList());

		} catch (IOException e) {
			System.err.println("No se ha encontrado el fichero " + nomfich);
			e.printStackTrace();
		}
		return lv;
	}
	
	public static Vuelo parseaVuelo(String datosVuelo){
		Checkers.checkNoNull(datosVuelo);
	    String[] trozos = datosVuelo.split(";");
	    Checkers.check("Formato no válido", trozos.length == 9);
	    String origen = trozos[0].trim();
	    String destino = trozos[1].trim();
	    Double precio = Double.parseDouble(trozos[2].trim());
	    Integer numPasajeros = Integer.parseInt(trozos[3].trim());
	    Integer numPlazas = Integer.parseInt(trozos[4].trim());
	    String codigoVuelo = trozos[5].trim();
	    LocalDate fecha = parseaFecha(trozos[6].trim());
	    Duration duracion=parseaDuracion(trozos[7].trim());
	    List<String> tripulacion = parseaTripulacion(trozos[8].trim());
	    
	    return new Vuelo(new Trayecto(origen, destino), precio, numPasajeros,
	    		      numPlazas, codigoVuelo, fecha, duracion, tripulacion);
	}

	private static List<String> parseaTripulacion(String cad) {
		List<String> tripulacion = new ArrayList<>();
	    String[] trozos = cad.split(",");
	    Checkers.check("FactoriaVuelos::parseaTripulacion.Formato no valido", trozos.length>2);
	    for (String trozo:trozos)
	           tripulacion.add(trozo.trim());
	    return tripulacion;
	}

	private static LocalDate parseaFecha(String cad) {
		return LocalDate.parse(cad, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	
	private static Duration parseaDuracion(String cad) {
		Integer min= Integer.parseInt(cad);
		return Duration.ofMinutes(min);
	}

	
}