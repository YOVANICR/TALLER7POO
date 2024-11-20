/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7ejemplos.Incorrectos;

/**
 *
 * @author yoven
 */
// Ejemplo Incorrecto 2: Exposición pública de atributos sensibles
// En este ejemplo, muestro por qué no es una buena idea declarar atributos sensibles como públicos.

public class CuentaBancariaEjemploIncorrecto {
    public double saldo;  // Atributo público (mala práctica)

    // Constructor
    public CuentaBancariaEjemploIncorrecto(double saldoInicial) {
        saldo = saldoInicial;
    }

    public static void main(String[] args) {
        CuentaBancariaEjemploIncorrecto cuenta = new CuentaBancariaEjemploIncorrecto(1000);

        // Accedemos directamente al saldo (no es seguro)
        System.out.println("Saldo inicial: " + cuenta.saldo);

        // Modificamos el saldo sin ninguna validación
        cuenta.saldo = -500;
        System.out.println("Saldo modificado: " + cuenta.saldo);  // Permite valores negativos
    }
}

