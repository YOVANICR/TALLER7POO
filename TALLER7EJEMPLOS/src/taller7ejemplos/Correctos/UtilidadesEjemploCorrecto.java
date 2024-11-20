/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Ejemplo Correcto 2: Clase pública con métodos de utilidad
// Este ejemplo muestra una clase pública con un método estático público para imprimir mensajes.

public class UtilidadesEjemploCorrecto {

    // Método público y estático para imprimir un mensaje
    public static void imprimirMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }

    // Método main para probar el código
    public static void main(String[] args) {
        UtilidadesEjemploCorrecto.imprimirMensaje("Hola, este es un ejemplo de metodo publico");
    }
}
