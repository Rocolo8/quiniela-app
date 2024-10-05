package demo.quinielaapp;
import java.util.List;
import java.util.ArrayList;

public class Sucursal {
    private int numero;
    private Quiniela quiniela;
    private Domicilio domicilio;
    private List<Vendedor> vendedores;

    public Sucursal(int numero, Quiniela quiniela, Domicilio domicilio) {
        this.numero = numero;
        this.quiniela = quiniela;
        this.domicilio = domicilio;
        this.vendedores = new ArrayList<>();
    }

    public void agregarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Sucursal nro: " + numero + ", Quiniela: " + quiniela;
    }
}
