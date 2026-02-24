package parafernalhas.E0701;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {
    private String nome;
    private NivelTrabalhador nivel;
    private Double salarioBase;

    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();

    public Trabalhador() {

    }

    public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }

    public void adicionaContrato(ContratoHora contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(ContratoHora contrato) {
        contratos.remove(contrato);
    }

    public double receita(Integer ano, Integer mes) {
        double soma = salarioBase;
        Calendar calendario = Calendar.getInstance();
        for (ContratoHora c : contratos) {
            calendario.setTime(c.getData());
            int c_ano = calendario.get(Calendar.YEAR);
            int c_mes =  calendario.get(Calendar.MONTH) + 1;
            if (c_ano == ano && c_mes == mes) {
                soma += c.valorTotal();
            }
        }
        return soma;
    }
}
