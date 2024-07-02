package projeto.pizza.enoque.service;


import projeto.pizza.enoque.entity.Pedido;
import java.math.BigDecimal;
import java.util.List;

public interface PedidoService {

    void criarPedido(Pedido pedido);

    void removerPedido(Long id);

    void atualizarPedido(Pedido pedido);

    Pedido buscarPedidoPorId(Long id);

    List<Pedido> listarPedidos();

}