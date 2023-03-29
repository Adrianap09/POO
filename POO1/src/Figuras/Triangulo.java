package Figuras;


 // Esta clase representa un triángulo, que es una figura geométrica.
 
public class Triangulo extends Figuras {
    
    private float base;
    private float altura;
    
   
      //Constructor que recibe la base y la altura del triángulo.
     
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
     //Retorna la base del triángulo.
     
    public float getBase() {
        return base;
    }

    
     //Establece la base del triángulo.
     
    public void setBase(float base) {
        this.base = base;
    }

    
    //Retorna la altura del triángulo.
    
    public float getAltura() {
        return altura;
    }

    
    //Establece la altura del triángulo.
     
    public void setAltura(float altura) {
        this.altura = altura;
    }

    
      //Calcula y muestra el área del triángulo.
     
    public void calcularArea() {
        float area = base * altura / 2;
        System.out.println("El área del triángulo con base " + base + " y altura " + altura + " es: " + area);
    }
    
}
