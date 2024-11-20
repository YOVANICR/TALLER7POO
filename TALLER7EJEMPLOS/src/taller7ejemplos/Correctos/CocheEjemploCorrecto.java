/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Ejemplo Correcto 1: Métodos públicos para acceso a atributos
// En este código, uso métodos públicos para acceder y modificar atributos privados de un coche.


public class CocheEjemploCorrecto {
    private String marca;  // Atributo privado
    private double velocidadMaxima;  // Atributo privado

    // Constructor público para inicializar los atributos
    public CocheEjemploCorrecto(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método público para obtener la marca del coche
    public String getMarca() {
        return marca;
    }

    // Método público para establecer la velocidad máxima
    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima > 0) {  // Validación simple
            this.velocidadMaxima = velocidadMaxima;
        }
    }

    // Método público para mostrar la información del coche
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Velocidad maxima: " + velocidadMaxima + " km/h");
    }

    // Método main para probar el código
    public static void main(String[] args) {
        CocheEjemploCorrecto coche = new CocheEjemploCorrecto("Toyota", 180);
        coche.mostrarInformacion();  // Muestra la informacion inicial

        // Modificamos la velocidad máxima usando el método público
        coche.setVelocidadMaxima(200);
        System.out.println("Nueva velocidad maxima: " + coche.getMarca() + " " + coche.velocidadMaxima + " km/h");
    }
}
