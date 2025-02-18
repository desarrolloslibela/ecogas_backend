package ecogas.backend.repositories;

import ecogas.backend.models.Cliente;
import ecogas.backend.models.ReclamoCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReclamoClienteRepository extends JpaRepository<ReclamoCliente, Long> {
    List<ReclamoCliente> findByCliente(Cliente cliente);
}
