package projeto.pizza.enoque.service.impl;

import projeto.pizza.enoque.entity.Pedido;
import projeto.pizza.enoque.repository.ClienteRepository;
import projeto.pizza.enoque.repository.EntregaRepository;
import projeto.pizza.enoque.repository.ItemRepository;
import projeto.pizza.enoque.repository.PedidoRepository;
import projeto.pizza.enoque.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
public class PedidoServiceImpl implements PedidoService{

    private final ClienteRepository clienteRepository;
    private final EntregaRepository entregaRepository;
    private final ItemRepository itemRepository;
    private final PedidoRepository pedidoRepository;

    @Override
    public void criarPedido(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    @Override
    public void removerPedido(Long id) {
        pedidoRepository.deleteById(id);
    }

    @Override
    public void atualizarPedido(Pedido pedido) {
        pedidoRepository.save(pedido);
    }

    @Override
    public Pedido buscarPedidoPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }
    @Override
    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }
}

