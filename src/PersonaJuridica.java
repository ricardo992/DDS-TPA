package src;
import java.util.List;

public class PersonaJuridica implements IColaborador{
    private String razonSocial;
    private ETipoJuridico TipoJuridico;
    private String rubro;
    // private List<MedioContacto> mediosContacto;
    private List<IDonacion> donacions;

    public PersonaJuridica(String razonSocial, ETipoJuridico tipoJuridico, String rubro) {
        this.razonSocial = razonSocial;
        TipoJuridico = tipoJuridico;
        this.rubro = rubro;
    }

    @Override
    public void agregarDonacion(IDonacion donacion) {
        //validaciones de donaciones para personas fisicas
        donacions.add(donacion);
    }
    
}
