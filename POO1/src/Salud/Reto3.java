package Salud;
import java.util.Scanner;
// se importan los paquetes y clases
import Salud.Empleado;
import Salud.Persona;
// se crea la clase
public class Reto3 { 
    //se crea el metodo main para que jecute toda la clase y la sub clase
public static void main(String[] args) {
    // se definen las variables
    String cargo;
    String departamento;
    double valorHora;
    int horastrabajadas;

    // se crea la clase scanner
    Scanner captura =new Scanner(System.in); 
    // se se crea la clase, el objeto, la palabra reservada y la contruccion
    Persona enfermera=new Persona();

    // se crea el metodo para solicitar datos
    enfermera.pedirDatos();
    enfermera.mostrarPersona();
    enfermera.mayorEdad();
    System.out.println("ingrese cargo");
    cargo=captura.next();
    
    System.out.println("ingrese  departamento");
    departamento=captura.next();

    System.out.println("ingrese el valor de las horas de trabajo");
    valorHora=captura.nextDouble();

    System.out.println("ingrese las horas trabajadas ");
    horastrabajadas=captura.nextInt();

     
    //se se crea la clase, el objeto, la palabra reservada y la contruccion con parametros
    Empleado empleado = new Empleado(enfermera.getTipoDoc(),enfermera.getDocumento(),enfermera.getNombre(),enfermera.getApellido(),enfermera.getPeso(),enfermera.getEstatura(),enfermera.getEdad(),enfermera.getSexo(),cargo, valorHora, horastrabajadas, departamento);
    empleado.calcularHonorarios();
    empleado.mostrarempleado();
    captura.close();


}
}
    


