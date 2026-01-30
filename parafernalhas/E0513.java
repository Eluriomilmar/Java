package parafernalhas;

public class E0513 {
    private int id;
    private String nome;
    private double salario;

    public E0513 (int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentaSalarioPorcentagem(double porcentagem) {
        this.salario = this.salario * (1 + porcentagem/100);
    }

    @Override
    public String toString() {
        return "E0513{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
