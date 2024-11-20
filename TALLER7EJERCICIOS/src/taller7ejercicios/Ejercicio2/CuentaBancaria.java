/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7ejercicios.Ejercicio2;

/**
 *
 * @author yoven
 */


// Clase CuentaBancaria
// Representa una cuenta bancaria con atributos públicos y privados.

public class CuentaBancaria {
    private String numeroCuenta; 
    private double saldo;        
    public String tipoCuenta;     

    // Constructor para inicializar las propiedades
    public CuentaBancaria(String numeroCuenta, double saldoInicial, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.tipoCuenta = tipoCuenta;
    }

    // Método público para obtener el saldo
    public double getSaldo() {
        return saldo;
    }

    // Método público para modificar el saldo
    public void setSaldo(double saldo) {
        if (saldo >= 0) {  // Validamos que el saldo no sea negativo
            this.saldo = saldo;
        } else {
            System.out.println("Error: El saldo no puede ser negativo");
        }
    }

    // Método público para mostrar los detalles de la cuenta
    public void mostrarDetalles() {
        System.out.println("Tipo de Cuenta: " + tipoCuenta + ", Saldo: " + saldo);
    }
}
