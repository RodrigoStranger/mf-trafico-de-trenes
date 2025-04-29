public class SensorEntreTrenes extends Sensor {
    private double distanciaConTrenDelantero;
    private boolean existeTren;

    public SensorEntreTrenes(int id, boolean activo, Tren tren,
            double distanciaConTrenDelantero, boolean existeTren) {
        super(id, activo, tren);
        this.distanciaConTrenDelantero = distanciaConTrenDelantero;
        this.existeTren = existeTren;
    }

    public double getDistanciaConTrenDelantero() {
        return distanciaConTrenDelantero;
    }

    public void setDistanciaConTrenDelantero(double distancia) {
        this.distanciaConTrenDelantero = distancia;
    }

    public boolean isExisteTren() {
        return existeTren;
    }

    public void setExisteTren(boolean existeTren) {
        this.existeTren = existeTren;
    }
}