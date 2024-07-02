package projeto.pizza.enoque.service.impl;

import projeto.pizza.enoque.entity.Entrega;
import projeto.pizza.enoque.repository.EntregaRepository;
import projeto.pizza.enoque.service.EntregaService;
import projeto.pizza.enoque.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import projeto.pizza.enoque.repository.ItemRepository;
import projeto.pizza.enoque.repository.PedidoRepository;

@Component
@RequiredArgsConstructor
public class EntregaServiceImpl implements EntregaService{

    private final ClienteRepository clienteRepository;
    private final EntregaRepository entregaRepository;
    private final ItemRepository itemRepository;
    private final PedidoRepository pedidoRepository;

    @Override
    public void acidionarEntrega(Entrega entrega) {
        entregaRepository.save(entrega);
    }

    @Override
    public void removerEntrega(Long id) { entregaRepository.deleteById(id); }

    @Override
    public void atualizarEntrega(Entrega entrega) {
        entregaRepository.save(entrega);
    }

    @Override
    public Entrega buscarEntregaPorId(Long id) {
        return entregaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Entrega> listarEntregas() {
        return entregaRepository.findAll();
    }
}
