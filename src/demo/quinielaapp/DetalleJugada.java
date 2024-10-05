package demo.quinielaapp;

public class DetalleJugada {
    private int monto;
    private int numero;
    private int posicion;

    public DetalleJugada(int monto, int numero, int posicion) {
        this.monto = monto;
        this.numero = numero;
        this.posicion = posicion;
    }

    public int getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return monto + "$\t\t\t" + numero + "\t\t\t" + posicion;
    }
}
