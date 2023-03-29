package Salud;

public class Empleado extends Persona {
    //señalamos los atributos siempre en privado
    private String cargo;
    private double valorHora;
    private double horasTrabajadas;
    private String departamento;
    // creamos la clase contructor
    public Empleado(String tipoDoc, String documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo, String cargo, double valorHora, double horasTrabajadas, String departamento) {
        super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }
    //solicitamos los setters y getters de los datos solcitados para el empleado
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    // calculamos el metodo calcular honorarios 
    public void calcularHonorarios(){
        double reteica;
        double honorarios=0;
        honorarios=valorHora;
        reteica=(0.966);
        honorarios=(honorarios=reteica);
        System.out.println("el total apagar es de:"+honorarios);
        System.out.println("" );
        }
        //creamos el metodo mostrar empleado 
        public void mostrarempleado(){
            System.out.println("el empleado "+getNombre()+ getApellido()+"tiene su cargo de: "+cargo+"donde trabaja un total de horas"+getHorasTrabajadas()+"donde el valor de sus horas es de: "+getValorHora()+"y se le paga un total de");
}
}


   