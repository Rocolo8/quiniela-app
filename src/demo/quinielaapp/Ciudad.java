package demo.quinielaapp;

public class Ciudad {
    private String provincia;
    private String ciudad;

    public Ciudad(String provincia, String ciudad) {
        this.provincia = provincia;
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return ciudad + ", " + provincia;
    }
}
