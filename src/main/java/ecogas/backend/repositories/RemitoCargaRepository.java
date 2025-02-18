package ecogas.backend.repositories;

import ecogas.backend.models.RemitoCarga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RemitoCargaRepository extends JpaRepository<RemitoCarga, Long> {
    List<RemitoCarga> findByFechaCarga (LocalDate fecha);
}
