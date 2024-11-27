/***
 * Generar una solución que permita ingresar jugadores de fútbol; por cada
 * jugador se debe solicitar:

Nombre el jugador
Posición en el campo de juego
Edad
Estatura
El ciclo de ingreso de información deberá terminar cuando el usuario lo decida.
* Se debe imprimir el siguiente reporte (usar una cadena de acumulación):

Listado de Jugadores
1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
4. Ángel Mena -Delantero-, edad 32, estatura 1.75
5. Michael Estrada -Delantero-, edad 27, estatura 1.93
Promedio de edades:  26.8
Promedio de estaturas: 1.87
* 
 * @author javiersolan010
 */
import java.util.Scanner;
public class Problema4_ListadoJugadores {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        String reporte = "Listado de Jugadores\n";
        int contador = 0;
        double sumaedades = 0, sumaestaturas = 0;
        boolean continuar = true;

        while (continuar) {
            contador++;

            System.out.println("Ingrese el nombre del jugador:");
            String nombre = tcl.nextLine();

            System.out.println("Ingrese la posicion en el campo de juego:");
            String posicion = tcl.nextLine();

            System.out.println("Ingrese la edad del jugador:");
            int edad = tcl.nextInt();

            System.out.println("Ingrese la estatura del jugador (en metros):");
            double estatura = tcl.nextDouble();
            tcl.nextLine(); 

            reporte += String.format("%d. %s -%s-, edad %d, estatura %.2f\n", 
                    contador, nombre, posicion, edad, estatura);
            sumaedades += edad;
            sumaestaturas += estatura;
            System.out.println("Desea ingresar otro jugador (si/no):");
            String respuesta = tcl.nextLine().toLowerCase();
            if (respuesta.equals("no")) {
                continuar = false;
            }
        }
        double promedioedades = sumaedades / contador;
        double promedioestaturas = sumaestaturas / contador;

        reporte += String.format("Promedio de edades: %.1f\n", promedioedades);
        reporte += String.format("Promedio de estaturas: %.2f\n", promedioestaturas);

        System.out.println("\n" + reporte);
    }
}

    

