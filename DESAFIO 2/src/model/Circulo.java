package model;

public class Circulo extends FormaGeometrica {

       public double raio;
       
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
  public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    void calcularArea() {
       // Calculate the area using the formula: area = π * raio^2
       double area = Math.PI * (raio * raio);  // More accurate using Math.PI
     System.out.println("A área do círculo é: " + String.format("%.2f", area));
    }
    
   
}
