package parafernalhas.E0804;

public class PessoaFisica extends Contribuinte{

    private double gastosComSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, double rendaAtual, double gastosComSaude) {
        super(nome, rendaAtual);
        this.gastosComSaude = gastosComSaude;
    }

    public double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    public double imposto() {
        if (getRendaAtual() < 20000) {
            return getRendaAtual() * 0.15 - gastosComSaude * 0.5;
        } else {
            return getRendaAtual() * 0.25 - gastosComSaude * 0.5;
        }
    }
}
