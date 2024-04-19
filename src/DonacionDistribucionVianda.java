package src;
public class DonacionDistribucionVianda implements IDonacion{
    private Heladera heladeraOrigen;
    private Heladera heladeraDestino;
    private int cantidadViandas;
    private EMotivoDistribucion motivoDistribucion;

    public DonacionDistribucionVianda(Heladera heladeraOrigen, Heladera heladeraDestino, int cantidadViandas,
            EMotivoDistribucion motivoDistribucion) {
        this.heladeraOrigen = heladeraOrigen;
        this.heladeraDestino = heladeraDestino;
        this.cantidadViandas = cantidadViandas;
        this.motivoDistribucion = motivoDistribucion;
    }
    
}
