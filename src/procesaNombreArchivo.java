import java.util.Scanner;

public class procesaNombreArchivo {
    public static void main(String[] args) {

        Scanner introducir = new Scanner(System.in);
        System.out.println("Introduce un nombre de arxivo con su extension");
        String arxivo = introducir.next();

        String nombre = "";
        String extension = "";
        //Con este primer bucle hacemos que nos vaya añadiendo los caractere de
        //"arxivo" en "nombre" hasta que se encuentre con el punto, cuendo encuenta el punto
        //termino con el bucle i paso al siguiente.
        for(int i=0; i<arxivo.length(); i++){

            if(arxivo.charAt(i) != '.'){
                nombre += arxivo.charAt(i);
            }else break;
        }
        // En este bucle al poner que la i es la largaria de "nombre" +1
        // hago que me empiece a introducir caracteres de "arxivo"  en "extension" desde
        // detras del punto.
        for(int i=nombre.length()+1; i<arxivo.length(); i++){
            extension += arxivo.charAt(i);
        }

        System.out.println("El nombre del arxivo es "+nombre);
        System.out.println("El nombre de la extension es "+extension);
    }
}
