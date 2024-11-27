/***
 * Realizar un programa Java que permita pedir por teclado el nombre de 
 * 5 empleados. Por cada empleado se debe solicitar el nombre, numero de días 
 * trabajados y costo del día trabajo. Calcular el valor a cancelar por la 
 * empresa para cada empleado.
 * 
 * @author javiersolan010
 */
import java.util.Scanner;
public class Problema3_CostoTrabajador {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        int cont = 1;
        double costodias, costo, numdias;
        while (cont <= 5) {
            System.out.println("Ingrese el nombre del empleado: ");
            nombre = tcl.next();
            System.out.println("Ingrese el numero de dias trabajados: ");
            numdias = tcl.nextInt();
            System.out.println("Ingrese el costo por dia trabajado: ");
            costodias = tcl.nextDouble();
            costo = numdias* costodias;
            cont++;
            System.out.println("\nReporte de Empleados:");
            System.out.printf("| %s\t | %s | %s | %s |\n", "Nombres", "Numerodias trabajados", "Cost_Dias Trabajados", "CostoT a Pagar");
            System.out.printf("| %s\t | %.2f\t | %.2f\t | %.2f\t |\n", nombre, numdias, costodias, costo);
            cont++;
            }
        }

    }
    


