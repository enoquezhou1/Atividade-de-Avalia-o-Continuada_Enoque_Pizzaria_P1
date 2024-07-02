package projeto.pizza.enoque.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.GenerationType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String telefone;
    private String endereco;
    private String codigoDeEntrega;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
    private List<Pedido> pedidos;

    public Cliente(String nome, String telefone, String endereço, String codigoDeEntrega) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
        this.codigoDeEntrega = codigoDeEntrega;
    }
}
