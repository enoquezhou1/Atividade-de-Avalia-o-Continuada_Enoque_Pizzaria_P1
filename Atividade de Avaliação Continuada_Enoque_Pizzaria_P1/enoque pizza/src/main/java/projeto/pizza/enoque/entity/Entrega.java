package projeto.pizzaria.enoque.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.CascadeType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataEntrega;
    private LocalTime horaEntrega;
    private String tipoPagamento;
    private String codigoDeEntrega;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Pedido pedido;

    public Entrega(LocalDate dataEntrega, LocalTime horaEntrega, String tipoPagamento, String codigoDeEntrega) {
        this.dataEntrega = dataEntrega;
        this.horaEntrega = horaEntrega;
        this.tipoPagamento = tipoPagamento;
        this.codigoDeEntrega = codigoDeEntrega;
    }
}
