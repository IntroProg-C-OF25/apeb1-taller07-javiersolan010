/***
 * Realizar un programa Java que permita presentar en pantalla la siguiente
 * secuencia:
	5/10
	10/12
	15/14
	20/16
	25/18
	30/20
 * @author javiersolan010
 */
import java.util.Scanner;
public class Problema2_Serie2 {
    public static void main(String[] args) {
          int cont = 0, numero = 5,denominador = 10, limite;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE EL LIMITE: ");
        limite = tcl.nextInt();
        while (cont <= limite){
            System.out.print(numero + "/" + denominador + ",");
            numero += 5;
            denominador += 2;
        cont++;
        
      }
    }
}
    
    

