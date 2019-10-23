/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sesion01;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * Clase que contiene los métodos que son invocados en la ClasePrincipal,
 * resuelve los problemas de la tarea presencial 2-2.
 *
 * @author Ángel Miguel Cubino Aragón
 * @version 2.0
 */
public class Ejercicios {

    /**
     * @param teclado Objeto de estatico de la clase Scanner
     */
    private static Scanner teclado = new Scanner(System.in);

    /**
     * Método que calcula la media de 5 números introducidos por teclado.
     */
    public static void mediaCincoNumeros() {

        int sumaMedia = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca un numero");
            int num = teclado.nextInt();
            sumaMedia = sumaMedia + num;
        }

        System.out.println("La media es de: " + sumaMedia / 5);
        teclado.next();
    }

    /**
     * Método suma numeros hasta alcanzar o superar el 88 y muestra el resultado
     * y la cantidad de números introducidos.
     */
    public static void sumaSucesiva() {

        int resul = 0;
        int contador = 0;

        do {
            System.out.println("Introduzca un sumando");
            int num = teclado.nextInt();
            resul = resul + num;
            contador++;

        } while (resul < 88);

        System.out.println("El numero obtenido de las sumas de los introducidos por teclado es de " + resul + " y se han utilizado " + contador + " numeros");
        teclado.next();
    }

    /**
     * Método que calcula la división de un número positivo entre 3, mediante
     * restas sucesivas, mostrando su resto y su cociente.
     */
    public static void divisionEntreTres() {
        int dividendo;
        int resto;
        int cociente;
        do {
            System.out.println("Introduzca el numero por teclado positivo");
            dividendo = teclado.nextInt();
            resto = dividendo;
            cociente = 0;

            while (resto >= 3) {
                resto = resto - 3;
                cociente++;
            }
        } while (dividendo < 0);

        System.out.println("El cociente de " + dividendo + " es: " + cociente + " y el resto: " + resto);
        teclado.next();

    }
    
    /**
     * Metodo que diferencia si eres menor o mayor de edad.
     */
    public static void mayoriaEdad(){
        byte edad;
        do {
            System.out.println("Introduzca su edad");
            edad = teclado.nextByte();
            if (edad >= 18) {
                System.out.println("Usted es mayor de edad");
            } else if (edad >= 0) {
                System.out.println("Usted es menor de edad");
            } else {
                System.out.println("No puede tener una edad menor a 0");
            }
        } while (edad < 0);
        teclado.next();
    }
    
    /**
     * Metodo que imprime por pantalla los dias del mes introducido.
     */
    public static void diasMes(){
        byte mes;
        
        do {
            System.out.println("1. Enero 2. Febrero 3. Marzo\n4. Abril 5. Mayo 6. Junio\n7. Julio 8. Agosto 9. Septiembre\n10. Octubre 11. Noviembre 12.Diciembre");
            System.out.println("Introduce el mes en formato numerico:");
            mes = teclado.nextByte();

            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("El mes introducido tiene 31 días");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("El mes introducido tiene 30 días");
                    break;
                case 2:
                    System.out.println("Febrero tiene 28 días, 29 en año bisiesto");
                    break;
                default:
                    System.out.println("El mes introducido no se contempla.");

            }
        } while (mes<=0 || mes>12);
        teclado.next();
    }
    
    /**
     * Metodo que calcula el factorial de un numero.
     */
    public static void factorial(){
        long fact = 1L;
        System.out.println("Introduzca un número:");
        int num = teclado.nextInt();

        for (int i = num; i > 0; i--) {
            fact = fact * i;
        }

        System.out.println("El factorial de " + num + " es: " + fact);
        teclado.next();
    }
    
}
