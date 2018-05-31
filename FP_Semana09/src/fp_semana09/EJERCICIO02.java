/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp_semana09;

/**
 *
 * @author Renato
 */
public class EJERCICIO02 {
    public static void main(String[] args) {
        int [] arreglo = {1, 2, 3, 4, 5, 6, 7};
        int resultado, multiplicador=1; 
        
        // Para cada valor de mi arreglo PAR
        for (int contador=0; contador < arreglo.length; contador ++) {
            if (arreglo[contador] % 2 == 0){
                resultado = arreglo[contador] * multiplicador;
                System.out.printf("\t%d x %d = %d\n", arreglo[contador], multiplicador, resultado);
                multiplicador = multiplicador + 1;
            }
        }
    }
}
