/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7ejercicios.Ejercicio1;

/**
 *
 * @author yoven
 */

// Clase Empleado
// Representa un empleado con un nombre público y un salario privado.

public class Empleado {
    public String nombre;  // Propiedad pública
    private double salario;  // Propiedad privada

    // Constructor para inicializar las propiedades
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);  // Valida el salario al inicializar
    }

    // Método público para obtener el salario
    public double getSalario() {
        return salario;
    }

    // Método público para establecer el salario con validación
    public void setSalario(double salario) {
        if (salario >= 0) {  // Validamos que el salario no sea negativo
            this.salario = salario;
        } else {
            System.out.println("Error: El salario no puede ser negativo");
        }
    }

    // Método para mostrar la información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}
