package Salud;

import java.util.Scanner;
// se crea la clase ejecucion
public class Reto2 {
    //se cea el metodo main que permite ejecutar
    public static void main(String[] args) {
        //se llama la clase, se crea el objeto y se uiliza la palabra reservada y el construir
        Persona2 persona = new Persona2();
        //declarar variables se llama en cadena donde s epone todo en una sola tira
        double peso, estatura;
        Scanner capturar = new Scanner(System.in);
        //solictar datos
        System.out.println("ingrese peso");
        peso = capturar.nextDouble();
        System.out.println("ingrese estatura");
        estatura = capturar.nextDouble();
    

        // aca se ejecuta los atributos requeridos
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc(  peso, estatura);
        persona.mayorEdad();

        
    
    }
}
