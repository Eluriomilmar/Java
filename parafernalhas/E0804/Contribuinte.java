package parafernalhas.E0804;

public abstract class Contribuinte {

    private String nome;
    private double rendaAtual;

    public Contribuinte() {

    }

    public Contribuinte(String nome, double rendaAtual) {
        this.nome = nome;
        this.rendaAtual = rendaAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAtual() {
        return rendaAtual;
    }

    public void setRendaAtual(double rendaAtual) {
        this.rendaAtual = rendaAtual;
    }

    public abstract double imposto();
}
