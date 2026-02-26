package parafernalhas.antes07;

public class ContaBanco {
    private int numConta;
    private String titular;
    private double saldo;

    public ContaBanco(int numConta, String titular, double saldo){
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBanco(int numConta, String titular){
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor){
        setSaldo(this.getSaldo() + valor);
    }

    public void saque(double valor){
        setSaldo(this.getSaldo() - valor);
    }

    public String toString() {
        return "ContaBanco{" +
                "numConta=" + numConta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
