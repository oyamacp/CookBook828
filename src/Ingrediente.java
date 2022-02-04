public class Ingrediente {
    private String nome;
    private double quantidade;
    private TipoMedida tipo;

    public Ingrediente(String nome, double quantidade, TipoMedida tipo) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public TipoMedida getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", tipo=" + tipo +
                '}';
    }
}
