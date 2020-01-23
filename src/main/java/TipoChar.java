//Tipo Primitivo Char
public class TipoChar {
    public static void main(String[] args) {

        System.out.println("bits tipo char: "+ Character.SIZE);
        System.out.println("bytes tipo char: "+Character.BYTES);
        System.out.println("Valor mínimo tipo char: "+Character.MIN_VALUE);
        System.out.println("Valor máximo tipo char: "+Character.MAX_VALUE);

        char varChar = '\u0021';
        System.out.println("varChar: "+varChar);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal: "+varCharDecimal);

        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo: "+varCharSimbolo);
    }
}
