package parafernalhas.antes07;

public class Estudante {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double total(){
        return (this.nota1 + this.nota2 + this.nota3);
    }
}
