package ecogas.backend.repositories;

import ecogas.backend.models.DetalleRutaEntrega;
import ecogas.backend.models.RutaEntrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleRutaEntregaRepository extends JpaRepository<DetalleRutaEntrega, Long> {
    List<DetalleRutaEntrega> findByRutaEntrega(RutaEntrega rutaEntrega);
}
