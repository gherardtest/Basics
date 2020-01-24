import java.util.Scanner;

public class TiendaLibros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Proporciona el Id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Proporciona el precio: ");
        Double precio = Double.parseDouble(scanner.nextLine());

        System.out.println("Proporciona el simbolo:");
        char simbolo = scanner.nextLine().charAt(0);

        System.out.println("Proporciona el envío gratuito: ");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(nombre + " #"+id);
        System.out.println("Precio: "+simbolo+precio);
        System.out.println("Envío gratuito: "+envioGratuito);
    }
}
