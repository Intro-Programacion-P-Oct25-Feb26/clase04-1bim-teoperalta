/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {
    public static void main(String[] args) {
        // Uso de printf
        // f: formato
        
        String nombreEstudiante = "Mateo Eduardo";
        String apellidoEstudiante = "Peralta Alvarado";
        int edad = 18;
        String dirección = "Época";
        String ciclo = "Uno";
        String universidad = "Universidad Técnica";        
        String paralelo = "A";
        String asignatura = "Introducción a la programación ";       
               
        System.out.printf("Nombre:\n\t%s \n Apellido: \n\t%s Edad:%s\n Dirección: \n\n\t%s\n ---- \n Universidad: %s\n Ciclo: %s\n Asignatura: %s\n Paralelo: \n\t%s\n ", nombreEstudiante, 
                apellidoEstudiante, edad, dirección, universidad, ciclo, asignatura, paralelo);
        
        
    }
}
