/*** 
 * Generar e imprimir la siguiente serie:

sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 * @author tatia
 */
public class Problema7_SumatoriaSerie {
    public static void main(String[] args) {
        int contador = 1; 
        double sumatoria = 1, termino = 1.0;

        while (contador <= 10) {
            termino = 1.0 / contador;
            if (contador % 2 == 0) {
                sumatoria += termino;
            } else {
                sumatoria -= termino;
            }
            contador++;
        }
        System.out.printf("La sumatoria alternada es: %.5f\n", sumatoria);
    }
    
}
    

