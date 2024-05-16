package aeropuerto;

public record Trayecto(String origen, String destino) {

    public Trayecto {
        if (origen.equals(destino)) {
            throw new IllegalArgumentException("El origen del trayecto no puede ser el mismo que el destino.");
        }
    }

    @Override
    public String toString() {
        return origen + " -> " + destino;
    }
}