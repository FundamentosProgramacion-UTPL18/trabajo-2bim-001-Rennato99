
package fp_semana09;

/**
 *
 * @author Renato
 */
public class EJERCICIO03 {
   
    public static void main(String[] args) {
        
        double [] calificaciones_progr = {18, 19, 15, 16, 17, 10};
        double [] calificaciones_bd = {10, 12, 13, 20, 17, 20};
        double [] promedios = new double[6];
        double suma = 0, promedio;
        
        for (int contador = 0; contador< calificaciones_bd.length; contador ++) {
            suma = calificaciones_progr[contador] + calificaciones_bd[contador];
            promedio = suma/2;
            promedios[contador] = promedio;
        } // Fin for
        System.out.println("  ESTUDIANTE \tPROGRAMACION\tBASE DE DATOS\tPROMEDIO");
        for (int contador = 0; contador< calificaciones_bd.length; contador ++) {
            System.out.printf("Estudiante %d:\t%.2f\t\t%.2f\t\t%.2f\n", contador+1, calificaciones_progr[contador], calificaciones_bd[contador], promedios[contador]);
            
            
        } // Fin for
    }
}
