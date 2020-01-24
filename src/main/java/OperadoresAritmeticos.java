public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 3, b = 2;

        int resultado = a + b;
        System.out.println("resultado = " + resultado);

        resultado = a - b;
        System.out.println("resultado = " + resultado);
        System.out.println("resultado = " + (a - b));

        resultado = a * b;
        System.out.println("resultado = " + resultado);
        
        double resultado2 = 3D / b;
        System.out.println("resultado2 = " + resultado2);

        resultado = a % b;
        System.out.println("resultado (residuo)= " + resultado);

        resultado = 2 % b;
        System.out.println("resultado = " + resultado);

        resultado = 123  % 2;
        System.out.println("resultado = " + resultado);

        if (resultado == 0){
            System.out.println("Es número par");
        }else {
            System.out.println("Es número impar");
        }

    }
}
