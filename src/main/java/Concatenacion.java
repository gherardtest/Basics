public class Concatenacion {
    public static void main(String[] args) {

        String usuario = "Juan";
        String saludar = "Hola";

        System.out.println(saludar+" "+usuario);

        int i = 1;
        int j = 2;

        System.out.println(i+j);

        // De izquierda a derecha concatena (Si la cadena es primero)
        System.out.println(saludar+i+j);

        //De izquierda a derecha suma (Si el entero es primero)
        System.out.println(i+j+saludar);
    }

}
