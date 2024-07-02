package projeto.pizza.enoque;

import projeto.pizza.enoque.entity.Cliente;
import projeto.pizza.enoque.entity.Entrega;
import projeto.pizza.enoque.entity.Item;
import projeto.pizza.enoque.entity.Pedido;
import projeto.pizza.enoque.entity.Pizza;
import projeto.pizza.enoque.service.ClienteService;
import projeto.pizza.enoque.service.EntregaService;
import projeto.pizza.enoque.service.ItemService;
import projeto.pizza.enoque.service.PedidoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Slf4j
@Configuration
@Profile({"projeto", "local"})
public class InitDB implements CommandLineRunner {

    private final ClienteService clienteService;
    private final EntregaService entregaService;
    private final ItemService itemService;
    private final PedidoService pedidoService;

    public InitDB(ClienteService clienteService, EntregaService entregaService,ItemService itemService, PedidoService pedidoService){
        this.clienteService = clienteService;
        this.entregaService = entregaService;
        this.itemService = itemService;
        this.pedidoService = pedidoService;
    }

    @Override
    public void run (String... arg) {
 
        Cliente cliente1 = new Cliente("Caneta Azul","11 1133-124554", "Avenida dos Memes, 0",33445);
        clienteService.adicionarCliente(cliente1);
        Cliente cliente2 = new Cliente("Silvio Santos","11 7771-22233", "Rua dos Ricos, 567",66991);
        clienteService.adicionarCliente(cliente2);
        Cliente cliente3 = new Cliente("Rita Lee","11 6667-31234", "Rua dos Cantores, 37",44113);
        clienteService.adicionarCliente(cliente3);

        Entrega entrega1 = new Entrega("2024-06-02", "20:30", "PIX", "7141");
        entregaService.acidionarEntrega(entrega1);
        Entrega entrega2 = new Entrega("2024-06-02", "21:40", "dinheiro", "7142");
        entregaService.acidionarEntrega(entrega2);
        Entrega entrega3 = new Entrega("2024-06-02", "22:30", "cartao", "7143");
        entregaService.acidionarEntrega(entrega3);

        Pedido pedido1 = new Pedido("2024-06-02", "19:30", "50.00", cliente1, entrega1 );
        pedidoService.adicionarPedido(pedido1);
        Pedido pedido2 = new Pedido("2024-06-02", "20:30", "60.00", cliente1, entrega2 );
        pedidoService.adicionarPedido(pedido2);
        Pedido pedido3 = new Pedido("2024-06-02", "23:30", "70.00", cliente2, entrega3 );
        pedidoService.adicionarPedido(pedido3);

        Item item1 = new Item("Fornela","50,00",1);
        itemService.adicionarItem(item1);
        Item item2 = new Item("Nutella","50.00",1);
        itemService.adicionarItem(item2);
        Item item3 = new Item("Quatro Queijos","50.00",1);
        itemService.adicionarItem(item3);
        Item item4 = new Item("Cola-cola 2L","20.00",2);
        itemService.adicionarItem(item4);
        Item item5 = new Item("Skol","8.00",1);
        itemService.adicionarItem(item5);
    }
}