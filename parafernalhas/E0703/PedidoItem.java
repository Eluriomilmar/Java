package parafernalhas.E0703;

public class PedidoItem {

    private Integer quantidade;
    private Double preco;
    private Double subTotal;

    private Produto produto;

    public PedidoItem() {

    }

    public PedidoItem(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.preco = produto.getPreco();
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return this.preco;
    }

    public Double getsubTotal() {
        this.subTotal = this.preco * this.quantidade;
        return this.subTotal;
    }

}
