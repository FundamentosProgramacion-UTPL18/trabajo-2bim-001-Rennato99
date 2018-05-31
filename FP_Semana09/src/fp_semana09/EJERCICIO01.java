package fp_semana09;

/**s
 * @author Renato
 */
public class EJERCICIO01 {
    public static void main(String[] args) {
        
        int [] c = new int [4]; // Arreglo c
        c [0] = 10; // Posicion  a valor de 10
        
        System.out.printf("Numero de datos dentro del arreglo: %d\n",c.length); // Numero de datos
        
        for (int contador =0; contador < c.length; contador ++) { // For [ara presentar los datos
            System.out.printf("Dato de la posicion %d: %d\n", contador, c[contador]);
        } // Fin for
       
    }
}
