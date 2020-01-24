import java.util.Scanner;

public class ConversionTiposVariables {
    public static void main(String[] args) {

        //Convertir un String  a un tipo int
        int edad1 = Integer.parseInt("20");
        System.out.println("edad: "+ edad1);

        //Convertir un String  a un tipo Double
        double valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI: "+valorPI);

        //Convertir un String a un tipo char
        char c = "hola".charAt(0);
        System.out.println("c: "+c);
        char d = "hola".charAt(2);
        System.out.println("d: "+d);

        //Lo que se ingresa a un tipo int
        Scanner scanner = new Scanner(System.in);
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Edad: "+edad);

        //Lo que se ingresa a un tipo char
        char caracter = scanner.nextLine().charAt(3);
        System.out.println("Caracter: "+caracter);

        //Integer a String
        String edadTexto = String.valueOf(26);
        System.out.println("edadTexto: "+edadTexto);

        short s = 10;
        byte b = (byte) s;
        System.out.println("b = " + b);

    }
}
