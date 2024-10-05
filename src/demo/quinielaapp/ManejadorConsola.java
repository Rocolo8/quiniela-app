package demo.quinielaapp;

import java.util.Scanner;

public class ManejadorConsola {
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        // Crear ciudad y domicilios del cliente, vendedor y quiniela
        Ciudad cordoba = new Ciudad("Córdoba", "Córdoba");
        Domicilio domCliente = new Domicilio("Av. Siempreviva", 123, cordoba);
        Domicilio domVendedor = new Domicilio("Calle Falsa", 456, cordoba);
        Domicilio domQuiniela = new Domicilio("Calle Real", 789, cordoba);

        // Crear cliente y vendedor
        Cliente cliente = new Cliente("Jorge", "Tizera", "12345678", "jorge@example.com", domCliente);
        Vendedor vendedor = new Vendedor("Carlos", "Revola", "87654321", "carlos@example.com", domVendedor);

        // Crear quiniela y sucursal
        Quiniela quiniela = new Quiniela("El", "Pacha", "12345678", "el.pacha@example.com", domQuiniela, "El PACHA", "20-12345678-9");
        Sucursal sucursal = new Sucursal(1, quiniela, domQuiniela);
        quiniela.agregarSucursal(sucursal);
        sucursal.agregarVendedor(vendedor);

        // Crear apuesta y jugadas
        Apuesta apuesta = new Apuesta(quiniela, sucursal, vendedor, cliente);

        // Manejar entradas de usuario por consola
        String continuar = "si";
        while (continuar.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el monto de la jugada:");
            int monto = scanner.nextInt();

            System.out.println("Ingrese el número apostado (2, 3 o 4 cifras):");
            int numero = scanner.nextInt();

            System.out.println("Ingrese la posición (1 a 10):");
            int posicion = scanner.nextInt();

            DetalleJugada jugada = new DetalleJugada(monto, numero, posicion);
            apuesta.agregarJugada(jugada);

            System.out.println("¿Desea agregar otra jugada? (si/no):");
            continuar = scanner.next();
        }

        apuesta.imprimirTique();

        scanner.close();
    }
}
