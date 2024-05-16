package aeropuerto;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Vuelo implements Comparable<Vuelo> {
    private Trayecto trayecto;
    private Double precio;
    private Integer numPasajeros;
    private Integer numPlazas;
    private String codigo;
    private LocalDate fecha;
    private Duration duracion;
    private List<String> tripulacion;

    public Vuelo(Trayecto trayecto, Double precio, Integer numPasajeros, Integer numPlazas, String codigo, LocalDate fecha,
                 Duration duracion, List<String> tripulacion) {
        if (numPlazas < 0) throw new IllegalArgumentException("El número de plazas debe ser mayor o igual que cero.");
        if (numPasajeros <= 0) throw new IllegalArgumentException("El número de pasajeros debe ser mayor que cero.");
        if (precio < 0) throw new IllegalArgumentException("El precio debe ser mayor o igual que cero.");
        if (numPasajeros > numPlazas) throw new IllegalArgumentException("El número de pasajeros debe ser inferior o igual que el número de plazas.");
        if (tripulacion.size() < 3) throw new IllegalArgumentException("El número de tripulantes del avión debe ser superior o igual a 3.");
        validarTripulacion(tripulacion);
        this.trayecto = trayecto;
        this.precio = precio;
        this.numPasajeros = numPasajeros;
        this.numPlazas = numPlazas;
        this.codigo = codigo;
        this.fecha = fecha;
        this.duracion = duracion;
        this.tripulacion = tripulacion;
    }

    private void validarTripulacion(List<String> tripulacion) {
        boolean tienePiloto = false;
        boolean tieneCopiloto = false;
        int asistentes = 0;

        for (String codigo : tripulacion) {
            if (!codigo.matches("[A-Z]{2}\\d{4}")) {
                throw new IllegalArgumentException("Los códigos de los tripulantes deben tener 6 caracteres, los dos primeros alfabéticos en mayúsculas y los cuatro últimos numéricos.");
            }
            if (codigo.startsWith("PP")) tienePiloto = true;
            else if (codigo.startsWith("CP")) tieneCopiloto = true;
            else if (codigo.startsWith("AV")) asistentes++;
        }

        if (!tienePiloto || !tieneCopiloto || asistentes == 0) {
            throw new IllegalArgumentException("Debe haber al menos un piloto, un copiloto y un asistente.");
        }

        if (tripulacion.size() > 3 && asistentes < (tripulacion.size() - 2)) {
            throw new IllegalArgumentException("Desde el cuarto tripulante en adelante deben ser asistentes.");
        }
    }

    public Trayecto getTrayecto() {
        return trayecto;
    }

    public void setTrayecto(Trayecto trayecto) {
        this.trayecto = trayecto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        if (precio < 0) throw new IllegalArgumentException("El precio debe ser mayor o igual que cero.");
        this.precio = precio;
    }

    public Integer getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(Integer numPasajeros) {
        if (numPasajeros <= 0) throw new IllegalArgumentException("El número de pasajeros debe ser mayor que cero.");
        if (numPasajeros > numPlazas) throw new IllegalArgumentException("El número de pasajeros debe ser inferior o igual que el número de plazas.");
        this.numPasajeros = numPasajeros;
    }

    public Integer getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(Integer numPlazas) {
        if (numPlazas < 0) throw new IllegalArgumentException("El número de plazas debe ser mayor o igual que cero.");
        this.numPlazas = numPlazas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }

    public List<String> getTripulacion() {
        return tripulacion;
    }

    public String getOrigen() {
        return trayecto.origen();
    }

    public String getDestino() {
        return trayecto.destino();
    }

    public Integer getDuracionMinutos() {
        return (int) duracion.toMinutes();
    }

    public Boolean getEstaCompleto() {
        return numPasajeros.equals(numPlazas);
    }

    public Double getPorcentajeOcupacion() {
        return (numPasajeros.doubleValue() / numPlazas.doubleValue()) * 100;
    }

    @Override
    public String toString() {
        return trayecto + " - " + codigo + " - " + fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return codigo.equals(vuelo.codigo) && fecha.equals(vuelo.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, fecha);
    }

    @Override
    public int compareTo(Vuelo otroVuelo) {
        int comparacionFecha = fecha.compareTo(otroVuelo.fecha);
        if (comparacionFecha == 0) {
            return codigo.compareTo(otroVuelo.codigo);
        }
        return comparacionFecha;
    }

    public void incrementaPrecioPorcentaje(Double porcentaje) {
        if (porcentaje < 0) throw new IllegalArgumentException("El porcentaje debe ser mayor o igual que cero.");
        this.precio += this.precio * (porcentaje / 100);
    }
}

