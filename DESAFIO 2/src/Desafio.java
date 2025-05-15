import java.util.Scanner;
import model.Circulo;
import model.Quadrado;

public class Desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raioCirculo = scan.nextDouble();
        Circulo c = new Circulo(raioCirculo);

        System.out.print("Digite o lado do quadrado: ");
        double ladoQuadrado = scan.nextDouble();
        Quadrado q = new Quadrado(ladoQuadrado);

        
        c.calcularArea();
        q.calcularArea();
        scan.close(); 
    }
}