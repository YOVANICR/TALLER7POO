/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7ejercicios.Ejercicio3;

/**
 *
 * @author yoven
 */
// Clase Utilidades
// Proporciona métodos públicos para realizar operaciones matemáticas básicas.

public class Utilidades {

    // Método público para sumar dos números
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método público para restar dos números
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método público para multiplicar dos números
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método público para dividir dos números (con validación)
    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir entre cero");
            return 0;  // Devuelve 0 en caso de error
        }
    }
}
