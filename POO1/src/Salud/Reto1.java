package Salud;
// se crea la clase ejecucion
public class Reto1 {
    //se cea el metodo main que permite ejecutar
    public static void main(String[] args) {
        //se llama la clase, se crea el objeto y se uiliza la palabra reservada y el construir
        Persona persona = new Persona();
       
        // aca se ejecuta los atributos requeridos
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        persona.mayorEdad();
        
    
    }
}
