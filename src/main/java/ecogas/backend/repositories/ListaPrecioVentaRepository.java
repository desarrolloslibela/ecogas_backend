package ecogas.backend.repositories;

import ecogas.backend.models.ListaPrecioVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ListaPrecioVentaRepository extends JpaRepository<ListaPrecioVenta, Long> {
    List<ListaPrecioVenta> findByFechaVigencia(LocalDate fecha);
}
