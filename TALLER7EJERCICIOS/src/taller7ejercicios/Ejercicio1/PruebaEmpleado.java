/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7ejercicios.Ejercicio1;

/**
 *
 * @author yoven
 */
// Clase de prueba para la clase Empleado
// Creo y manipulo objetos de tipo Empleado.

public class PruebaEmpleado {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Empleado
        Empleado empleado = new Empleado("Ana", 3500);

        // Mostramos la información del empleado
        empleado.mostrarInformacion();

        // Cambiamos el salario usando el método set
        empleado.setSalario(4000);
        System.out.println("Nuevo salario: " + empleado.getSalario());

        // Intentamos establecer un salario negativo
        empleado.setSalario(-500);  // Esto generará un mensaje de error
    }
}
