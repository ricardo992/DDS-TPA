package src;

import java.util.List;

public class Heladera {
    private String longitud;
    private String latitud;
    private String direccion;
    private String nombre;
    private int capacidadViandas;
    private List<Vianda> viandas;

    public Heladera(String longitud, String latitud, String direccion, String nombre, int capacidadViandas) {
        this.longitud = longitud;
        this.latitud = latitud;
        this.direccion = direccion;
        this.nombre = nombre;
        this.capacidadViandas = capacidadViandas;
    }
    
    public void agregarVianda(Vianda vianda){
        if(viandas.size() < capacidadViandas){
            viandas.add(vianda);
        }else{
            throw new RuntimeException("capacidad llena");
        }
    }
}
