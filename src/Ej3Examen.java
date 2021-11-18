import java.util.Scanner;

public class Ej3Examen {

    // El programa (dado) nos saca los multiplos de tres(porque 3 es el numero que se va sumando en el bucle)


        public static void main(String[] args) {
            Scanner introducir = new Scanner(System.in);
            System.out.println("Introduce dos numeros entre los que sacar los multiplos de tres");
            int inicio = introducir.nextInt();
            int fin = introducir.nextInt();
        // Ahora el progarama los numero multiplos de el primer numero que introducimos entre los dos numeros que nosotros queramos
        // ya que los introducimos nosotros por pantalla i tenemos la formula de que si el numero
        // al
            for (int i = inicio; i < fin; i += inicio) {
                    System.out.println(i);
            }
        }
}
