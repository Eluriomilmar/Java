import parafernalhas.E0703.Pedido;
import parafernalhas.E0703.PedidoItem;
import parafernalhas.E0703.Produto;
import parafernalhas.E0703.StatusPedido;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Ex0703 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Pedido pedido = new Pedido(sdf.parse("24/02/2026"), StatusPedido.valueOf("PROCESSANDO"));

        Produto produto = new Produto("Carrinho de rolimã", 10.00);

        PedidoItem item = new PedidoItem(2, produto);
        pedido.adicionaItem(item);
        System.out.println(pedido);


    }
}
