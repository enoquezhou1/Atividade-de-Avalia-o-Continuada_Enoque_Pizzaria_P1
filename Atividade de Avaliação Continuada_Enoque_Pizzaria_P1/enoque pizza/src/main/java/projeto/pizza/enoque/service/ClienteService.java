package projeto.pizza.enoque.service;

import projeto.pizza.enoque.entity.Cliente;
import projeto.pizza.enoque.entity.Pedido;
import projeto.pizza.enoque.request.ClienteRequest;
import projeto.pizza.enoque.response.ClienteResponse;

import java.util.List;

public interface ClienteService {

    void criarCliente(Cliente cliente);
    
    void deletarCliente(Long id);

    void atualizarCliente(Cliente cliente);

    List<Cliente> buscarClientePorNome(String nome);

    Cliente buscarClientporTelefone(String telefone);

    List<Cliente> listarClientes();

}