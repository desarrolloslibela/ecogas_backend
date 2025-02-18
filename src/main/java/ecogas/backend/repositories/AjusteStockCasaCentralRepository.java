package ecogas.backend.repositories;

import ecogas.backend.models.AjusteStockCasaCentral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AjusteStockCasaCentralRepository extends JpaRepository <AjusteStockCasaCentral, Long> {
    List<AjusteStockCasaCentral> findByFecha (LocalDate fecha);
}
