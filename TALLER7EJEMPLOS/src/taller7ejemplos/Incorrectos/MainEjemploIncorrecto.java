/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7ejemplos.Incorrectos;

/**
 *
 * @author yoven
 */
// Clase Main en paquete2
// Este ejemplo intenta acceder a la clase PersonaEjemploIncorrecto desde otro paquete, lo que genera un error.

/* INICIO

package paquete2;

import paquete1.PersonaEjemploIncorrecto;  // Intentamos importar la clase (no funciona porque no es pública)

public class MainEjemploIncorrecto {
    public static void main(String[] args) {
        // Intentamos crear una instancia de PersonaEjemploIncorrecto
        PersonaEjemploIncorrecto persona = new PersonaEjemploIncorrecto("Juan");
        System.out.println("Nombre: " + persona.nombre);  // Error: PersonaEjemploIncorrecto no es visible
    }
}
*/