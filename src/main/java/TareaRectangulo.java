import java.util.Scanner;

public class TareaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el alto: ");
        int alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el ancho: ");
        int ancho = Integer.parseInt(scanner.nextLine());

        double area = alto * ancho;
        System.out.println("Área: " + area);

        double perimetro = (alto + ancho) * 2;
        System.out.println("Perímetro: " + perimetro);
    }
}
