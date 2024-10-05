package demo.quinielaapp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private static int contadorClientes = 0;
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private Domicilio domicilio;
    private String codigoCliente;

    public Cliente(String nombre, String apellido, String dni, String email, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.domicilio = domicilio;
        this.codigoCliente = generarCodigoCliente();
    }

    private String generarCodigoCliente() {
        contadorClientes++;
        String fecha = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        return "C-" + fecha + "-" + contadorClientes;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}