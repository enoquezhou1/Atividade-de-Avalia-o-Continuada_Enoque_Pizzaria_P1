package projeto.pizza.enoque.service;

import projeto.pizza.enoque.entity.Item;

import java.util.List;

public interface ItemService {

    void criarItem(Item item);

    void removerItem(Long id);

    void atualizarItem(Item item);

    Item buscarItemPorDescricao(String descricao);

    List<Item> listarItens();

}

    

