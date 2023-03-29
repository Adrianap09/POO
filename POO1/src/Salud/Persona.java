package Salud;

import java.util.Scanner;

public class Persona {
    //atributos privados
    private String tipoDoc;
    private String documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;

     // se crea un metodo vacio
    public Persona () {
    }
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
        
        System.out.println("Ingrese peso en kg: ");
        peso = sc.nextDouble();
        
        System.out.println("Ingrese estatura en m: ");
        estatura = sc.nextDouble();
        
        System.out.println("Ingrese edad: ");
        edad = sc.nextInt();
        
        System.out.println("Ingrese sexo (M/F): ");
        sexo = sc.next();
    }
    
     // empezamos con el metodo contructor para definir y establecer los valores inciales
    public Persona(String tipoDoc, String documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }
    

    // metodo settes y getters
    public String getTipoDoc() {
        return tipoDoc;
    }


    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }


    public String getDocumento() {
        return documento;
    }


    public void setDocumento(String documento) {
        this.documento = documento;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public double getEstatura() {
        return estatura;
    }


    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    // se crea otro metodo para mostrar datos capturados
    public void mostrarPersona() {
        // imprime el atributo capturado
        System.out.println("Tipo de documento: " + tipoDoc);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso en kg: " + peso);
        System.out.println("Estatura en m: " + estatura);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }
    // se crea el metodo calcular
    public void calcularImc() {
        // se capura los numeros decimles
        double imc = peso / (estatura * estatura);
        // se crea la condicion, si if mc es menor a 20 imprime el mensaje 
        if (imc < 20) {
            System.out.println("El peso está por debajo de lo ideal");
            //imc es mayor o = a 20 y imc es menor o = a 25 imprime el peso ideal
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("El peso es ideal");
            // si no cumple con las condiciones anteriores tiene sobre peso
        } else {
            System.out.println("Tiene sobrepeso");
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
