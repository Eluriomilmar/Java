package parafernalhas.E0703;

import parafernalhas.E0701.ContratoHora;
import parafernalhas.E0702.Comentario;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Pedido {

    private Date momento;
    private StatusPedido statusPedido;

    private List<PedidoItem> pedidos = new ArrayList<>();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Pedido() {


    }

    public Pedido(Date momento, StatusPedido statusPedido) {

        this.momento = momento;
        this.statusPedido = statusPedido;

    }

    public void adicionaItem(PedidoItem pedido) {

        pedidos.add(pedido);

    }

    public void removeItem(PedidoItem pedido) {

        pedidos.remove(pedido);

    }

    public double total() {
        double soma = 0;
        for (PedidoItem p : pedidos) {
            soma += p.getsubTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento: ");
        sb.append(momento + "\n");
        sb.append("Status do pedido: ");
        sb.append(statusPedido + "\n");
        sb.append("Pedidos: ");
        for (int i = 0 ; i < pedidos.size() ; i++) {
            sb.append(pedidos.get(i));
            sb.append(" ");
        }
        sb.append("\n");
        sb.append("sdf = " + momento);
        return sb.toString();
    }

}
