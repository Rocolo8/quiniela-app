package demo.quinielaapp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vendedor {
    private static int contadorVendedores = 0;
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private Domicilio domicilio;
    private String codigoVendedor;

    public Vendedor(String nombre, String apellido, String dni, String email, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.domicilio = domicilio;
        this.codigoVendedor = generarCodigoVendedor();
    }

    private String generarCodigoVendedor() {
        contadorVendedores++;
        String fecha = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        return "V-" + fecha + "-" + contadorVendedores;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
