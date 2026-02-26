package parafernalhas.antes07;

public class Empregado{
    public String nome;
    public double SalarioBruto;
    public double imposto;

    public double SalarioLiquido(){
        return this.SalarioBruto - this.imposto;
    }

    public void AumentaSalario(double porcentagem){
        System.out.printf("Salário atualizado para: %.2f", SalarioLiquido() + this.SalarioBruto*porcentagem/100);
    }
}
