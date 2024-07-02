package projeto.pizza.enoque.service.impl;

import projeto.pizza.enoque.entity.Item;
import projeto.pizza.enoque.repository.ItemRepository;
import projeto.pizza.enoque.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import projeto.pizza.enoque.repository.ClienteRepository;
import projeto.pizza.enoque.repository.EntregaRepository;
import projeto.pizza.enoque.repository.PedidoRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {


    private final ClienteRepository clienteRepository;
    private final EntregaRepository entregaRepository;
    private final PedidoRepository pedidoRepository;
    private final ItemRepository itemRepository;

    @Override
    public void criarItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public List<Item> listarItens() {
        return itemRepository.findAll();
    }

    @Override
    public void atualizarItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public Item buscarItemPorDescricao(String descricao) {
        return itemRepository.findByDescricao(descricao);
    }

    @Override
    public void removerItem(Long id) {
        itemRepository.deleteById(id);
    }
}

