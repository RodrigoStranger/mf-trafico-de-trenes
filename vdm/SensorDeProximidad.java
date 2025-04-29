public class SensorDeProximidad extends Sensor {
    private boolean deteccion;
    private String queSeDetecta;

    public SensorDeProximidad(int id, boolean activo, Tren tren,
            boolean deteccion, String queSeDetecta) {
        super(id, activo, tren);
        this.deteccion = deteccion;
        this.queSeDetecta = queSeDetecta;
    }

    public boolean isDeteccion() {
        return deteccion;
    }

    public void setDeteccion(boolean deteccion) {
        this.deteccion = deteccion;
    }

    public String getQueSeDetecta() {
        return queSeDetecta;
    }

    public void setQueSeDetecta(String queSeDetecta) {
        this.queSeDetecta = queSeDetecta;
    }
}
