/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7ejercicios.Ejercicio3;

/**
 *
 * @author yoven
 */
// Clase de prueba para la clase Utilidades
// Uso los métodos de la clase Utilidades para realizar operaciones matemáticas.

public class PruebaUtilidades {
    public static void main(String[] args) {
        // Realizo operaciones matemáticas usando los métodos públicos de la clase Utilidades
        System.out.println("Suma: " + Utilidades.sumar(12, 8));
        System.out.println("Resta: " + Utilidades.restar(15, 5));
        System.out.println("Multiplicacion: " + Utilidades.multiplicar(6, 7));
        System.out.println("Division: " + Utilidades.dividir(20, 4));
        System.out.println("Intento de division por cero: " + Utilidades.dividir(10, 0));  // Genera un mensaje de error
    }
}
