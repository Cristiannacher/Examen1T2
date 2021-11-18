
import java.util.Scanner;

public class EstadisticasEquipos {

    // En el metodo metemos un array de los resultados que hemos imprimido por pantalla
    // i con un bucle que nos va comprovando si los valores del array son igual a 1
    // vamos sumando en un contador cuando los valores son iguales a 1
    // i tenemos el total de ganados
    public static int partidosGanados(int[] resultados) {

        int ganados = 0;

        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i] == 1) {
                ganados++;
            }
        }
        return ganados;
    }
    // En el metodo metemos un array de los resultados que hemos imprimido por pantalla
    // y con un bucle que nos va comprovando si los valores del array son igual a 0
    // vamos sumando en un contador cuando los valores son iguales a 0
    // y tenemos el total de perdidos
    public static int partidosPerdidos(int[] resultados) {

        int perdidos = 0;

        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i] == 0) {
                perdidos++;
            }
        }
        return perdidos;
    }
    // En el metodo metemos un array de los resultados que hemos imprimido por pantalla
    // y con un bucle que nos va comprovando si los valores del array son igual a 2
    // vamos sumando en un contador cuando los valores son iguales a 2
    // y tenemos el total de empates.
    public static int partidosEmpatados(int[] resultados) {

        int empatados = 0;

        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i] == 2) {
                empatados++;
            }
        }
        return empatados;
    }
    // En este metodo tenemos una array interna para almacenar los valores y un bucle
    // que nos va diciendo si los valores son pares(en este caso los introducimos en locales)
    public static int[] filtraPartidosLocal(int[] resultados) {

        int[] locales = new int[resultados.length / 2];

        for (int i = 0; i < resultados.length; i++) {
            if (i % 2 == 0) {
                locales[i/2] = resultados[i];
            }
        }
        return locales;
    }
    // En este metodo tenemos una array interna para almacenar los valores y un bucle
    // que nos va diciendo si los valores son impares (en este caso los introducimos en visitantes)
    public static int[] filtraPartidosVisitante(int[] resultados) {

        int[] visitante = new int[resultados.length / 2];

        for (int i = 1; i < resultados.length; i ++) {
            if (i % 2 != 0) {
                visitante[i/2] = resultados[i];
            }
        }
        return visitante;
    }

    public static int calculaPuntos(int ganados, int perdidos, int empatados) {

        int pganados = ganados * 3;
        int pempatados = empatados * 1;
        int pperdidos = perdidos * 0;

        int puntostotales = pempatados + pganados + pperdidos;

        return puntostotales;
    }

    public static void muestaEstadisticasEquipo(int[] resultados) {


        System.out.println("Puntos totales " + calculaPuntos(partidosGanados(resultados), partidosPerdidos(resultados), partidosEmpatados(resultados)));
        System.out.println("Han ganado " + partidosGanados(resultados));
        System.out.println("Han empatado " + partidosEmpatados(resultados));
        System.out.println("Han perdido " + partidosPerdidos(resultados));

        System.out.println("Puntos totales en local " + calculaPuntos(partidosGanados(filtraPartidosLocal(resultados)), partidosPerdidos(filtraPartidosLocal(resultados)), partidosEmpatados(filtraPartidosLocal(resultados))));
        System.out.println(" En local han ganado " + partidosGanados(filtraPartidosLocal(resultados)));
        System.out.println(" En local han perdido " + partidosPerdidos(filtraPartidosLocal(resultados)));
        System.out.println(" En local han empatado " + partidosEmpatados(filtraPartidosLocal(resultados)));

        System.out.println("Puntos totales en local " + calculaPuntos(partidosGanados(filtraPartidosVisitante(resultados)), partidosPerdidos(filtraPartidosVisitante(resultados)), partidosEmpatados(filtraPartidosVisitante(resultados))));
        System.out.println(" En local han ganado " + partidosGanados(filtraPartidosVisitante(resultados)));
        System.out.println(" En local han perdido " + partidosPerdidos(filtraPartidosVisitante(resultados)));
        System.out.println(" En local han empatado " + partidosEmpatados(filtraPartidosVisitante(resultados)));
    }

    public static void main(String[] args) {


        Scanner introducir = new Scanner(System.in);
        System.out.println("Introduce el numero de partidos jugados que sera par");
        int partidos = introducir.nextInt();
        System.out.println("Introduce el resultado por partido, 0 perdido, 1 ganador, 2 empate");

        int[] resultados = new int[partidos];

        for (int i = 0; i < resultados.length; i++) {
            int resultado = introducir.nextInt();
            if (resultado != 0 && resultado != 1 && resultado != 2) {
                System.out.println("tas equibocau");
               for(int j =0; j>0; i++){
                   System.out.println("Introduce un resultado correcto porfavor");
                   int resultado2 = introducir.nextInt();
                   if (resultado2 == 0 || resultado2 == 1 || resultado2 == 2){
                       resultados[i] = resultado2;
                       break;
                   }
               }
            } else resultados[i] = resultado;
        }
        muestaEstadisticasEquipo(resultados);
    }

}