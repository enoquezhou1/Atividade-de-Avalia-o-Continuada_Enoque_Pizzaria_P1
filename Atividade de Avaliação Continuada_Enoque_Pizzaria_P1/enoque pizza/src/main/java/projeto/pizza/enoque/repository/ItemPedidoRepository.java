package projeto.pizza.enoque.repository;

import pizzaria.projeto.pizza.entity.ItemPedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
    Item findByDescricao(String descricao);
}