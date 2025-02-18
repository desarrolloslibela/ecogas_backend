package ecogas.backend.repositories;

import ecogas.backend.models.RutaEntrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RutaEntregaRepository extends JpaRepository<RutaEntrega, Long> {
    Optional<RutaEntrega> findByActiva(boolean activa);
}
