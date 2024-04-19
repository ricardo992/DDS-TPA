package src;

import java.time.LocalDateTime;

public class Vianda {
    private String nombreComida;
    private LocalDateTime fechaCaducidad;
    private LocalDateTime fechaDonacion;
    //me parece que el colaborador no debe ir aca porque es el colaborador el que dona la vianda
    private Heladera heladera;
    private Float calorias;
    private Float peso;
    private EEstadoEntrega estadoEntrega;

    public Vianda(String nombreComida, LocalDateTime fechaCaducidad, LocalDateTime fechaDonacion, Heladera heladera,
            Float calorias, Float peso, EEstadoEntrega estadoEntrega) {
        this.nombreComida = nombreComida;
        this.fechaCaducidad = fechaCaducidad;
        this.fechaDonacion = fechaDonacion;
        this.heladera = heladera;
        this.calorias = calorias;
        this.peso = peso;
        this.estadoEntrega = estadoEntrega;
    }

}
