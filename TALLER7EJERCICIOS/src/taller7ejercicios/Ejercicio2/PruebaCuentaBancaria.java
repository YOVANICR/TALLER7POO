/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7ejercicios.Ejercicio2;

/**
 *
 * @author yoven
 */
// Clase de prueba para la clase CuentaBancaria
// Manipulo objetos de tipo CuentaBancaria y mostramos sus detalles.

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        // Creo un objeto de la clase CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("12345", 5000, "Ahorros");

        // Mostro los detalles de la cuenta
        cuenta.mostrarDetalles();

        // Intento acceder directamente a numeroCuenta. esto genera un error 
        // System.out.println(cuenta.numeroCuenta);

        // Modifico el saldo usando el método público
        cuenta.setSaldo(7000);
        System.out.println("Saldo actualizado: " + cuenta.getSaldo());
    }
}
