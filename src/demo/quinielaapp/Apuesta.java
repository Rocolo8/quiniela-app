package demo.quinielaapp;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Apuesta {
    private Date fecha;
    private Quiniela quiniela;
    private Sucursal sucursal;
    private Vendedor vendedor;
    private Cliente cliente;
    private List<DetalleJugada> jugadas;

    public Apuesta(Quiniela quiniela, Sucursal sucursal, Vendedor vendedor, Cliente cliente) {
        this.fecha = new Date();
        this.quiniela = quiniela;
        this.sucursal = sucursal;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.jugadas = new ArrayList<>();
    }

    public void agregarJugada(DetalleJugada jugada) {
        jugadas.add(jugada);
    }

    public void imprimirTique() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        System.out.println("=============================================================================");
        System.out.println(sdf.format(fecha) + "  Sorteo: Nocturno\t Quiniela: " + quiniela + "  Sucursal nro: " + sucursal.getNumero());
        System.out.println("Vendedor: " + vendedor + "\t Cliente: " + cliente);
        System.out.println("=============================================================================");
        System.out.println("\t\t\tApuesta");
        System.out.println("=============================================================================");
        System.out.println("IMPORTE \t\tNUMERO\t\t\tPOSICION");
        for (DetalleJugada jugada : jugadas) {
            System.out.println(jugada);
        }
        int total = jugadas.stream().mapToInt(DetalleJugada::getMonto).sum();
        System.out.println("=============================================================================");
        System.out.println("\t\t\t\t\tTotal Apuesta: " + total + "$");
        System.out.println("=============================================================================");
    }
}
