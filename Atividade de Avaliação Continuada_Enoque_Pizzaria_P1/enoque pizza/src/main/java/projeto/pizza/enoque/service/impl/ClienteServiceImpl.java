package projeto.pizza.enoque.service.impl;


import projeto.pizza.enoque.entity.Cliente;
import projeto.pizza.enoque.entity.Pedido;
import projeto.pizza.enoque.mapper.ClienteMapper;
import projeto.pizza.enoque.request.ClienteRequest;
import projeto.pizza.enoque.response.ClienteResponse;
import projeto.pizza.enoque.repository.ClienteService;
import projeto.pizza.enoque.service.ClienteService;

import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final EntregaRepository entregaRepository;
    private final ItemRepository itemRepository;
    private final PedidoRepository pedidoRepository;

    @Override
    public void adicionarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public void atualizarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> buscarClientePorNome(String nome) {
        return clienteRepository.findByNome(nome);
    }

    @Override
    public Cliente buscarClientporTelefone(String telefone) { return clienteRepository.findByTelefone(telefone); }

    @Override
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }


}