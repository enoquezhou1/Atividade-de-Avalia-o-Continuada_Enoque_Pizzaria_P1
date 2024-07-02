package projeto.pizza.enoque.repository;

import projeto.pizza.enoque.entity.Entrega;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {
    List<Entrega> findByDataEntrega(LocalDate dataEntrega);
    Entrega findBycodigoDeEntrega(String codigoDeEntrega);
}