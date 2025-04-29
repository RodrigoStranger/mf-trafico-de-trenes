import java.time.LocalDateTime;

public class Alerta {
    private int id;
    private AlertaType tipo;
    private String mensaje;
    private LocalDateTime fechaHora;

    public Alerta(int id, AlertaType tipo, String mensaje, LocalDateTime fechaHora) {
        this.id = id;
        this.tipo = tipo;
        this.mensaje = mensaje;
        this.fechaHora = fechaHora;
    }

    public int getId() {
        return id;
    }

    public AlertaType getTipo() {
        return tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
}
