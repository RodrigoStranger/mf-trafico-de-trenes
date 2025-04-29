import java.util.List;
import java.util.ArrayList;

public abstract class Sensor {
    protected int id;
    protected boolean activo;
    protected Tren tren;  // asociación: cada sensor monitorea un tren
    protected List<Alerta> alertas = new ArrayList<>();

    public Sensor(int id, boolean activo, Tren tren) {
        this.id = id;
        this.activo = activo;
        this.tren = tren;
        this.tren.addSensor(this);
    }

    public int getId() {
        return id;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void enviarAlerta(Alerta alerta) {
        alertas.add(alerta);
        // potencialmente notificar al SistemaControl
    }

    public List<Alerta> getAlertas() {
        return new ArrayList<>(alertas);
    }
}
