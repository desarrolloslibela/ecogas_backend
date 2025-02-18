package ecogas.backend.repositories;


import ecogas.backend.models.GastoOperativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface GastoOperativoRepository extends JpaRepository<GastoOperativo, Long> {
    List<GastoOperativo> findByFecha(LocalDate fecha);
}