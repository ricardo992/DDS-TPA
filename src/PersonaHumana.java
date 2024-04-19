package src;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonaHumana implements IColaborador{
    private String nombre;
    private String apellido;
    //Se que los medios de contacto tienen algun patron de diseño pero todavia no se cual, estoy seguro que no es un strategy
    // private List<MedioContacto> mediosContacto;
    private Date fechaNacimiento;
    private String direccion;
    private List<IDonacion> donaciones;

    public PersonaHumana(String nombre, String apelllido, Date fechaNacimiento, String direccion){
        this.nombre = nombre;
        this.apellido = apelllido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        donaciones = new ArrayList< >();
    }

    @Override
    public void agregarDonacion(IDonacion donacion) {
        //validaciones para donaciones de personas juridicas
        donaciones.add(donacion);
    }
}
