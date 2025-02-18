package ecogas.backend.repositories;

import ecogas.backend.models.DescuentoVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DescuentoVentaRepository extends JpaRepository<DescuentoVenta, Long> {
    List<DescuentoVenta> findByFechaInicio(LocalDate fecha);
}
