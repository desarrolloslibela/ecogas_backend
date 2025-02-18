package ecogas.backend.repositories;

import ecogas.backend.models.StockCasaCentral;
import ecogas.backend.models.TipoEnvase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockCasaCentralRepository extends JpaRepository<StockCasaCentral, Long> {
    List<StockCasaCentral> findByTipoEnvase (TipoEnvase tipo);
}
