package heranca.model;

public class Carro extends Veiculo {

    private double portaMalas;
    private boolean aC;

    // Construtor
    public Carro(String marca, String modelo, double portaMalas, boolean aC) {
        super(marca, modelo);
        this.portaMalas = portaMalas;
        this.aC = aC;
    }

    // Getters e Setters
    public double getPortaMalas() {
        return portaMalas;
    }

    public void setPortaMalas(double portaMalas) {
        this.portaMalas = portaMalas;
    }

    public boolean isaC() {
        return aC;
    }

    public void setaC(boolean aC) {
        this.aC = aC;
    }
  
    @Override
    public String toString() {
        return "Carro{" + 
               "marca='" + getMarca() + '\'' + 
               ", modelo='" + getModelo() + '\'' +
               ", portaMalas=" + portaMalas + 
               ", aC=" + aC + 
               '}';
    }
    public void exibirDetalhes() {
        System.out.println("Detalhes do Carro:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Porta-malas: " + portaMalas + " litros");
        System.out.println("Ar-condicionado: " + (aC ? "Sim" : "Não"));
    }
}
