/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion01;
/*
* Se invocan las clase del paquete java.util
*/
import java.util.*;

/**
 * Clase principal en el que se elige las opciones pertinentes con un llamado a
 * la clase Ejercicios cada una.
 *
 * @author Ángel Miguel Cubino Aragón
 * @version 2.0
 *
 */
public class ClasePrincipal {

    /**
     * Método principal de la clase.
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        byte elec;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Elija una opcion: \n1.Ejercicio 1 - Media de Cinco Numeros "
                    + "\n2.Ejercicio 2 - Suma Sucesiva\n3.Ejercicio 3 - División entre tres"
                    +"\n4.Ejercicio 4 - Mayoria de Edad"
                    +"\n5.Ejercicio 5 - Dias del mes"
                    +"\n6.Ejercicio 6 - Factorial de un numero"
                    + "\nTeclea 0 para cerrar el programa.");
            elec = teclado.nextByte();
            switch (elec) {
                case 0:
                    System.out.println("Cerrando programa...");
                    break;
                case 1:
                    Ejercicios.mediaCincoNumeros();
                    break;
                case 2:
                    Ejercicios.sumaSucesiva();
                    break;
                case 3:
                    Ejercicios.divisionEntreTres();
                    break;
                case 4:
                    Ejercicios.mayoriaEdad();
                    break;
                case 5:
                    Ejercicios.diasMes();
                    break;
                case 6:
                    Ejercicios.factorial();
                    break;
                default:
                    System.out.println("Antonio, ese ejercicio no existe.");
            }

        } while (elec < 0 || elec > 6);
    }

}
