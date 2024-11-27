/***
 * Problema 1
 * Realizar un programa Java que permita presentar en pantalla la 
 * siguiente secuencia: 1/10, 2/11, 3/12, 3/14, ...... n
 * @author javiersolan010
 */
import java.util.Scanner;
public class Problema1_Serie1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 1, limite;
        System.out.print("DAME EL LIMITE: ");
        limite = tcl.nextInt();
        while (contador <= limite){
            System.out.print(contador + "/" + (contador+9) + ", ");
            contador++;
            
        }
         System.out.println("");   
            
        }
    
        
    }
    

