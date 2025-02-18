package ecogas.backend.repositories;

import ecogas.backend.models.DetalleRemitoCarga;
import ecogas.backend.models.RemitoCarga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleRemitoCargaRepository extends JpaRepository<DetalleRemitoCarga, Long> {
    List<DetalleRemitoCarga> findByRemitoCarga (RemitoCarga remitoCarga);
}
