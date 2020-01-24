//Tipo Primitivo Boolean
public class TipoBoolean {
    public static void main(String[] args) {
        //Boolean
        System.out.println("True tipo boolean: "+Boolean.TRUE);
        System.out.println("False tipo boolean: "+Boolean.FALSE);

        boolean booleanVar = false;

        if(booleanVar){
            System.out.println("El valor es verdadero");
        }else{
            System.out.println("El valor es falso");
        }

        System.out.println("");

        int edad = 30;
        boolean esAdulto = edad >= 18;

        System.out.println("esAdulto: "+esAdulto);

    }
}
