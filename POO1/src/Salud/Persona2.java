package Salud;

import java.util.Scanner;

public class Persona2 {
    //atributos privados
    private String tipoDoc;
    private String documento;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    //metodos para solicitar y capturar dato
    public void pedirDatos() {
        //llamar objeto
        Scanner sc = new Scanner(System.in);
        //solicitar dato
        System.out.println("Ingrese tipo de documento: ");
        // capturar el atributo
        tipoDoc = sc.nextLine();
        
        System.out.println("Ingrese número de documento: ");
        documento = sc.nextLine();
        
        System.out.println("Ingrese nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese apellido: ");
        apellido = sc.nextLine();
        
       
        
        System.out.println("Ingrese edad: ");
        edad = sc.nextInt();
        
        System.out.println("Ingrese sexo (M/F): ");
        sexo = sc.next();
    }
    // se crea otro metodo para mostrar datos capturados
    public void mostrarPersona() {
        // imprime el atributo capturado
        System.out.println("Tipo de documento: " + tipoDoc);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }
    // se crea el metodo calcular se cambia el valor del retorno por string
    public String calcularImc(double peso, double estatura) {
        double imc = peso / (estatura * estatura);
    //Para hacer esto, simplemente reemplazamos la instrucción
        if (imc < 20) {
            return "PESOBAJO";
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("El peso es ideal");
            return "PESOIDEAL";
        } else {
            System.out.println("Tiene sobrepeso");
            return "SOBREPESO";
        }
    }
    
    // se crea el metodo edad
    public void mayorEdad() {
        // si if es mayor o igual a 18 s eimprime el mensaje
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            // si no se cumple solo se imprime que es menor de edad
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
