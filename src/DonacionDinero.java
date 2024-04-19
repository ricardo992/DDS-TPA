package src;
import java.util.Date;

public class DonacionDinero implements IDonacion {
    private Date fechaDonacion;
    private Float monto;
    private String frecuencia; //este no se de que tipo deberia ser

    public DonacionDinero(Date fechaDonacion, Float monto, String frecuencia) {
        this.fechaDonacion = fechaDonacion;
        this.monto = monto;
        this.frecuencia = frecuencia;
    }
    
}
