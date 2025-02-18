package ecogas.backend.repositories;

import ecogas.backend.models.DescuentoCompraEnvasadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DescuentoCompraEnvasadoraRepository extends JpaRepository<DescuentoCompraEnvasadora, Long> {
    List<DescuentoCompraEnvasadora> findByFechaAplicacion(LocalDate fecha);
}
