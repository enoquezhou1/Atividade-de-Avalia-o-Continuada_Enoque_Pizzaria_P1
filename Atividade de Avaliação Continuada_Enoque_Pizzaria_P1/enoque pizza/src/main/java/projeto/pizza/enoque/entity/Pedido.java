package projeto.pizza.enoque.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataPedido;
    private LocalTime horaPedido;

    private int quantidadeItens;
    private BigDecimal valorTotal;

    @ManyToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "entrega_id", referencedColumnName = "id")
    private Entrega entrega;

    public Pedido(LocalDate dataPedido, LocalTime horaPedido, BigDecimal valorTotal, Cliente cliente, Entrega entrega){
        this.data = dataPedido;
        this.hora = horaPedido;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.entrega = entrega;
    }
}