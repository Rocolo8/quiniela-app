package demo.quinielaapp;
import java.util.List;
import java.util.ArrayList;

public class Quiniela {
    private String nombrePropietario;
    private String apellido;
    private String dni;
    private String email;
    private Domicilio domicilio;
    private String nombreFantasia;
    private String cuit;
    private List<Sucursal> sucursales;

    public Quiniela(String nombrePropietario, String apellido, String dni, String email, Domicilio domicilio, String nombreFantasia, String cuit) {
        this.nombrePropietario = nombrePropietario;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.domicilio = domicilio;
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
        this.sucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    @Override
    public String toString() {
        return nombreFantasia;
    }
}
