import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar usuario: ");
        String usuario = scanner.nextLine();
        System.out.println("usuario = " + usuario);
    }
}