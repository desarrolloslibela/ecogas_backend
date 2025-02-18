package ecogas.backend.repositories;

import ecogas.backend.models.DetalleEntrega;
import ecogas.backend.models.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleEntregaRepository extends JpaRepository<DetalleEntrega, Long> {
    List<DetalleEntrega> findByEntrega(Entrega entrega);
}
