package parafernalhas.E0804;

public class PessoaJuridica extends Contribuinte {

    private int numeroFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, double rendaAtual, int numeroFuncionarios) {
        super(nome, rendaAtual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public double imposto() {
        if (numeroFuncionarios < 11) {
            return getRendaAtual() * 0.16;
        } else {
            return getRendaAtual() * 0.14;
        }
    }
}
