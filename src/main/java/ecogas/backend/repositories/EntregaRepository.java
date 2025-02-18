package ecogas.backend.repositories;

import ecogas.backend.models.Cliente;
import ecogas.backend.models.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntregaRepository extends JpaRepository <Entrega, Long> {
    List<Entrega> findByCliente (Cliente cliente);
}
