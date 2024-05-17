package aeropuerto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Vuelos {
    private String nombre;
    private List<Vuelo> vuelos;

    public Vuelos(String nombre, List<Vuelo> vuelos) {
        this.nombre = nombre;
        this.vuelos = new ArrayList<>(vuelos);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Vuelo> getVuelos() {
        return new ArrayList<>(vuelos);
    }

    public Integer getNumeroVuelos() {
        return vuelos.size();
    }

    public Integer getNumeroPasajeros() {
        return vuelos.stream().mapToInt(Vuelo::getNumPasajeros).sum();
    }

    public Double getPrecioMedio() {
        return vuelos.stream().mapToDouble(Vuelo::getPrecio).average().orElse(0.0);
    }

    public Integer getNumeroDestinos() {
        return (int) vuelos.stream().map(Vuelo::getDestino).distinct().count();
    }
    
    // BLOQUE 4
    // 1. Dado un destino, existe algún vuelo con ese destino
    public Boolean exiteAlgunVuelo(String destino) {
    	return vuelos.stream()
    			.anyMatch(x -> x.getDestino().equals(destino));
    }
    
    // 2. Dado un número n devuelve cierto si todos los vuelos tienen al menos n pasajeros.
    public Boolean compruebaNPasajeros(int n) {
    	return vuelos.stream()
    			.allMatch(x -> x.getNumPasajeros() >= n);
    }
    
    // 3. Dada una fecha, cuántos vuelos hay ese día.
    public Long cuantosVuelosEseDia(LocalDate fechaAConsultar) {
    	return vuelos.stream()
    			.filter(x -> x.getFecha().equals(fechaAConsultar))
    			.count();
    }
    
    // 4. Dada una fecha devuelve una lista con los vuelos posteriores a esa fecha.
    public List<Vuelo> listaVuelosPosteriores(LocalDate fecha) {
    	return vuelos.stream()
    			.filter(x -> x.getFecha().isAfter(fecha))
    			.collect(Collectors.toList());
    }
    
    // 5. Dada una fecha devuelve un conjunto con los destinos de los vuelos anteriores a esa fecha.
    public Set<String> conjuntoDestinosAnteriores(LocalDate fecha) {
    	return vuelos.stream()
    			.filter(x -> x.getFecha().isBefore(fecha))
    			.map(Vuelo::getDestino)
    			.collect(Collectors.toSet());
    }
    
    // 6. Dado un conjunto de destinos devuelve el número de pasajeros a los destinos del conjunto
    public Long numPasajerosEnDestinos(Set<String> destinos) {
    	return vuelos.stream()
    			.filter(x -> destinos.contains(x.getDestino()))
    			.mapToLong(Vuelo::getNumPasajeros)
    			.sum();
    }
    
    // 7. Dado un mes como un entero devuelve el precio medio de los vuelos de ese mes.
    public Double precioMedioMes(Integer numMes) {
    	return vuelos.stream()
    			.filter(x -> x.getFecha().getMonthValue() == numMes)
    			.mapToDouble(Vuelo::getPrecio)
    			.average()
    			.orElse(0.00);
    }
    
    // 8. Dado un año como un entero devuelve la recaudación de los vuelos de ese año. Suponga que todos los pasajeros pagan el mismo precio.
    public Double getRecaudacion(Integer anho) {
    	return vuelos.stream()
    			.filter(x -> x.getFecha().getYear() == anho)
    			.mapToDouble(x -> x.getPrecio() * x.getNumPasajeros())
    			.sum();
    }
    
    // 9. Devuelve el vuelo con mayor número de pasajeros. Si no se puede calcular devuelve null.
    public Vuelo getVueloMasPasajeros () {
    	return vuelos.stream()
    			.max(Comparator.comparing(Vuelo::getNumPasajeros))
    			.orElse(null);
    }
    
    
    // 10.Dado un destino devuelve el código del vuelo de menor precio que vuela a ese destino. Eleva NoSuchElementException si no se puede calcular.
    public String getCodigoVueloMenorPrecio(String destino) {
    	return vuelos.stream()
    			.filter(x -> x.getDestino().equals(destino))
    			.min(Comparator.comparing(Vuelo::getPrecio))
    			.map(Vuelo::getCodigo)
    			.get();
    }
    
    // 11.Dado un número n devuelve una lista con los n vuelos más baratos.
    public List<Vuelo> getNVuelosMasBaratos(int n) {
    	return vuelos.stream()
    			.sorted(Comparator.comparing(Vuelo::getPrecio))
    			.limit(n)
    			.collect(Collectors.toList());
    }
    
    // 12.Dado un número n devuelve una lista con los n vuelos de mayor duración.
    public List<Vuelo> getNVuelosMasDuracion(int n) {
    	return vuelos.stream()
    			.sorted(Comparator.comparing(Vuelo::getDuracion).reversed())
    			.limit(n)
    			.collect(Collectors.toList());
    }
    
    // BLOQUE 5
    // 1. Dada una fecha f devuelve el número de destinos diferentes de todos los vuelos de fecha
    public Long numDestinosFecha(LocalDate f) {
    	return vuelos.stream()
    			.filter(x -> x.getFecha().equals(f))
    			.map(Vuelo::getDestino)
    			.distinct()
    			.count();
    }
    
    // 2. Devuelve un conjunto ordenado con los vuelos ordenados por el orden natural del tipo
    public SortedSet<Vuelo> vuelosOrdenados() {
    	return vuelos.stream()
    			.collect(Collectors.toCollection(TreeSet::new));
    }
    
    // 3. Dada una letra devuelve un conjunto ordenado alfabéticamente de manera ascendente con los destinos que empiezan por esa letra
    public SortedSet<String> destinosOrdenadosPorLetra(String letra) {
		return vuelos.stream()
				.map(Vuelo::getDestino)
		        .filter(destino -> destino.startsWith(letra))
		        .collect(Collectors.toCollection(TreeSet::new));
    }
    
    // 4. Devuelve un conjunto ordenado por longitud de caracteres con los destinos de todos los vuelos
    public SortedSet<String> destinosOrdenadosPorCaracteres() {
    	return vuelos.stream()
    			.map(Vuelo::getDestino)
		        .sorted(Comparator.comparing(String::length))
		        .collect(Collectors.toCollection(TreeSet::new));
    }
    
    // 5. Usa el método collect junto con la clase Collectors para los siguientes ejercicios que ya hemos resuelto de otra manera:
    // 5a. Dada una fecha, cuántos vuelos hay ese día 
    public Long numDestinosFechaCollect(LocalDate f) {
    	return vuelos.stream()
    			.filter(x -> x.getFecha().equals(f))
    			.collect(Collectors.counting());
    }
    
    // 5b. Dado un mes como un entero devuelve el precio medio de los vuelos de ese mes
    public Double precioMedioMesCollect(Integer numMes) {
    	return vuelos.stream()
    			.filter(x -> x.getFecha().getMonthValue() == numMes)
    			.collect(Collectors.averagingDouble(Vuelo::getPrecio));
    }
    
    // 5c. Dado un año como un entero devuelve la recaudación de los vuelos de ese año
    public Double recaudacionUnAnhoCollect(Integer anho) {
    	return vuelos.stream()
    			.filter(x -> x.getFecha().getYear() == anho)
    			.collect(Collectors.summingDouble(x -> x.getPrecio() * x.getNumPasajeros()));
    }
    
    // 5d. Devuelve el Vuelo con mayor número de pasajeros
    public Vuelo mayorNumPasajerosCollect() {
    	return vuelos.stream()
    			.collect(Collectors.maxBy(Comparator.comparing(Vuelo::getNumPasajeros)))
    	        .orElse(null);
    }
    
    // 5 pero con Maps
    // 5.1. Devuelve un Map que a cada fecha le haga corresponder una lista con sus vuelos
    private Map<LocalDate, List<Vuelo>> listaVuelosFecha() {
    	return vuelos.stream()
    			.collect(Collectors.groupingBy(Vuelo::getFecha));
    }
    
    // 5.2. Devuelve un Map que a cada fecha le haga corresponder un conjunto con sus vuelos
    private Map<LocalDate, Set<Vuelo>> conjuntoVuelosFecha() {
    	return vuelos.stream()
    	        .collect(Collectors.groupingBy(Vuelo::getFecha, Collectors.toSet()));
    }
    
    // 5.3. Devuelve un Map que a cada fecha le haga corresponder el número de vuelos
    private Map<LocalDate, Long> numVuelosPorFecha() {
    	return vuelos.stream()
    			.collect(Collectors.groupingBy(Vuelo::getFecha, 
    					Collectors.counting()));
    }
    
    // 5.4. Devuelve un Map que a cada destino le haga corresponder el número total de plazas
    private Map<String, Integer> numPlazasPorDestino() {
    	return vuelos.stream()
    			.collect(Collectors.groupingBy(Vuelo::getDestino,
    					Collectors.summingInt(Vuelo::getNumPlazas)));
    }
    
    // 5. 5.Devuelve un Map que a cada destino le haga corresponder el precio medio de sus vuelos
    private Map<String, Double> precioMedioDestino() {
    	return vuelos.stream()
    			.collect(Collectors.groupingBy(Vuelo::getDestino,
    					Collectors.averagingDouble(Vuelo::getPrecio)));
    }
    
    // 5. 6.Devuelve un Map que a cada destino le haga corresponder un conjunto con las fechas de los vuelos a ese destino
    private Map<String, Set<LocalDate>> fechasPorDestino() {
    	return vuelos.stream()
    			.collect(Collectors.groupingBy(Vuelo::getDestino,
    					Collectors.mapping(Vuelo::getFecha, Collectors.toSet())));
    }
    
    // BLOQUE 6
    
    @Override
    public String toString() {
        return vuelos.stream().map(Vuelo::toString).collect(Collectors.joining("\n"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelos vuelos1 = (Vuelos) o;
        return nombre.equals(vuelos1.nombre) && vuelos.equals(vuelos1.vuelos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, vuelos);
    }

    public Integer getNumPasajerosDestino(String destino) {
        return vuelos.stream().filter(v -> v.getDestino().equals(destino)).mapToInt(Vuelo::getNumPasajeros).sum();
    }

    public void incorporaVuelo(Vuelo v) {
        vuelos.add(v);
    }

    public void incorporaVuelos(Collection<Vuelo> nuevosVuelos) {
        vuelos.addAll(nuevosVuelos);
    }

    public void eliminaVuelo(Vuelo v) {
        vuelos.remove(v);
    }

    public void ordena() {
        vuelos.sort(Vuelo::compareTo);
    }

    public Boolean existeVueloDestino(String destino) {
        return vuelos.stream().anyMatch(v -> v.getDestino().equals(destino));
    }
}