import java.util.List;
import java.util.ArrayList;

public class Tren {
    private int id;
    private TrenType tipo;
    private double distanciaSeguridad;
    private List<Sensor> sensores = new ArrayList<>();

    public Tren(int id, TrenType tipo, double distanciaSeguridad) {
        this.id = id;
        this.tipo = tipo;
        this.distanciaSeguridad = distanciaSeguridad;
    }

    public int getId() {
        return id;
    }

    public TrenType getTipo() {
        return tipo;
    }

    public double getDistanciaSeguridad() {
        return distanciaSeguridad;
    }

    public void addSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public List<Sensor> getSensores() {
        return new ArrayList<>(sensores);
    }

    public void desacelerar() {
        // lógica para desacelerar el tren
    }

    public void acelerar() {
        // lógica para acelerar el tren
    }

    public void frenar() {
        // lógica para frenar el tren
    }
}
