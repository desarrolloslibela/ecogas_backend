package ecogas.backend.repositories;

import ecogas.backend.models.ListaPrecioCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ListaPrecioCompraRepository extends JpaRepository<ListaPrecioCompra, Long> {
    List<ListaPrecioCompra> findByFechaVigencia(LocalDate fecha);
}