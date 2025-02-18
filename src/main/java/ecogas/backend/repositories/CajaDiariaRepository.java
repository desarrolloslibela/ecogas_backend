package ecogas.backend.repositories;

import ecogas.backend.models.CajaDiaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CajaDiariaRepository extends JpaRepository<CajaDiaria, Long> {
    List<CajaDiaria> findByFecha(LocalDate fecha);
}
