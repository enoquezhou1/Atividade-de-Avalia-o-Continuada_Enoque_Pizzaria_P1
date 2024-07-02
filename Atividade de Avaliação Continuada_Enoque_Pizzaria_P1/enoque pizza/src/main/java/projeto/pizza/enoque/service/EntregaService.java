package projeto.pizza.enoque.service;

import projeto.pizza.enoque.entity.Entrega;

import java.util.List;

public interface EntregaService {

    void adicionarEntrega(Entrega entrega);

    void removerEntrega(Long id);

    void atualizarEntrega(Entrega entrega);

    Entrega buscarEntregaPorId(Long id);

    List<Entrega> listarEntregas();
}