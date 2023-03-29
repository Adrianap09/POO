package Figuras;

//Esta clase representa un rectángulo, que es una figura geométrica.

public class Rectangulo extends Figuras {

private float base;
private float altura;

//Constructor que recibe la base y la altura del rectángulo.

public Rectangulo(float base, float altura) {
this.base = base;
this.altura = altura;
}


//Retorna la base del rectángulo.

public float getBase() {
return base;
}


//Establece la base del rectángulo.

public void setBase(float base) {
this.base = base;
}


//Retorna la altura del rectángulo.

public float getAltura() {
return altura;
}


//Establece la altura del rectángulo.
public void setAltura(float altura) {
this.altura = altura;
}


//Calcula y muestra el área del rectángulo.


public void calcularArea() {
float area = base * altura;
System.out.println("El área del rectángulo con base " + base + " y altura " + altura + " es: " + area);
}
}