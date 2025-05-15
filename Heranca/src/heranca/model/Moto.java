package heranca.model;

public class Moto extends Veiculo {

    private int cl;

    // Construtor
    public Moto(String marca, String modelo, int cl) {
        super(marca, modelo);  // Chama o construtor da classe pai (Veiculo)
        this.cl = cl;
    }

    // Métodos getter e setter
    public int getCl() {
        return cl;
    }

    public void setCl(int cl) {
        this.cl = cl;
    }


    @Override
    public String toString() {
        return "Moto{" + "cl=" + cl + '}';
    }


    public void exibirDetalhes() {

        System.out.println("Detalhes da Moto:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cilindrada (cl): " + getCl());
    }
}

    

    
