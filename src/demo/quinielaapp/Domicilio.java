package demo.quinielaapp;

public class Domicilio {
    private String calle;
    private int numero;
    private Ciudad ciudad;

    public Domicilio(String calle, int numero, Ciudad ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return calle + " " + numero + ", " + ciudad;
    }
}
