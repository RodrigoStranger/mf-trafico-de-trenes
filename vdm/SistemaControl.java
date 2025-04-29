import java.util.List;
import java.util.ArrayList;

public class SistemaControl {
    private String nombre;
    private List<Tren> trenes;

    public SistemaControl(String nombre) {
        this.nombre = nombre;
        this.trenes = new ArrayList<>();
    }

    public void agregarTren(Tren tren) {
        trenes.add(tren);
    }

    public void emitirOrdenes(String mensaje) {
        System.out.println("Sistema de Control '" + nombre + "' emitiendo orden: " + mensaje);
        for (Tren tren : trenes) {
            System.out.println("Orden enviada al Tren ID " + tren.getId() + ": " + mensaje);
        }
    }

    public void calibrarVelocidad(Tren trenAtras) {
        System.out.println("Calibrando velocidad del Tren ID " + trenAtras.getId());
        trenAtras.desacelerar();
    }

    public void recibirAlertas(Alerta alerta) {
        System.out.println("Alerta recibida:");
        System.out.println("Tipo: " + alerta.getTipo());
        System.out.println("Mensaje: " + alerta.getMensaje());
        System.out.println("Fecha y Hora: " + alerta.getFechaHora());
    }

    // Getter opcional si quieres acceder a los trenes
    public List<Tren> getTrenes() {
        return trenes;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }
}
