package model;

public class Quadrado extends FormaGeometrica {

    private double lado;  // Modifiquei para 'private' para seguir boas práticas de encapsulamento

    // Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Getter e Setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Sobrescrita do método calcularArea()
    @Override
    void calcularArea() {
        double area = Math.pow(lado, 2);  // Alternativa: lado * lado
        System.out.println("A área do quadrado é: " + String.format("%.2f", area));
    }
}
