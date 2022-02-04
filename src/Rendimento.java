public class Rendimento {
    private int minimo;
    private int maximo;
    private TipoRendimento tipo;

    public Rendimento(int minimo, int maximo, TipoRendimento tipo) {
        this.minimo = minimo;
        this.maximo = maximo;
        this.tipo = tipo;
    }

    public Rendimento(int quantidade, TipoRendimento tipo) {
        maximo = minimo = quantidade;
        this.tipo = tipo;
    }

    public int getMinimo() {
        return minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    public TipoRendimento getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Rendimento{" +
                "minimo=" + minimo +
                ", maximo=" + maximo +
                ", tipo=" + tipo +
                '}';
    }
}
