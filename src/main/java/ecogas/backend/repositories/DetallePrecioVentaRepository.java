package ecogas.backend.repositories;

import ecogas.backend.models.DetallePrecioVenta;
import ecogas.backend.models.ListaPrecioVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetallePrecioVentaRepository extends JpaRepository<DetallePrecioVenta, Long> {
    List<DetallePrecioVenta> findByListaPrecioVenta(ListaPrecioVenta listaPrecioVenta);
}
