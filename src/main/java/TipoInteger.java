//Tipo Primitivo Integer
public class TipoInteger {
    public static void main(String[] args) {

        byte byteVar = 15;
        System.out.println("ByteVar: "+byteVar);

        System.out.println("bites tipo byte: "+Byte.SIZE);
        System.out.println("bytes tipo bytes: "+Byte.BYTES);
        System.out.println("Valor mínimo tipo bytes: "+Byte.MIN_VALUE);
        System.out.println("Valor máximo tipo bytes: "+Byte.MAX_VALUE+"\n");

        ///////

        short shortVar = 32767;
        System.out.println("ShortVar: "+shortVar);

        System.out.println("bites tipo short: "+Short.SIZE);
        System.out.println("bytes tipo short: "+Short.BYTES);
        System.out.println("Valor mínimo tipo short: "+Short.MIN_VALUE);
        System.out.println("Valor máximo tipo short: "+Short.MAX_VALUE+"\n");

        ///////

        int intVar = 512334243;
        System.out.println("IntVar: "+intVar);

        System.out.println("bites tipo int: "+Integer.SIZE);
        System.out.println("bytes tipo int: "+ Integer.BYTES);
        System.out.println("Valor mínimo tipo int: "+Integer.MIN_VALUE);
        System.out.println("Valor máximo tipo int: "+Integer.MAX_VALUE+"\n");

        ////////

        long longVar = 121123123123L;
        System.out.println("DoubleVar: "+longVar);

        System.out.println("bites tipo long: "+Long.SIZE);
        System.out.println("bytes tipo long: "+Long.BYTES);
        System.out.println("Valor mínimo tipo long: "+Long.MIN_VALUE);
        System.out.println("Valor máximo tipo long: "+Long.MAX_VALUE);


    }
}
