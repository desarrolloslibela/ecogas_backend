package ecogas.backend.repositories;

import ecogas.backend.models.DetallePrecioCompra;
import ecogas.backend.models.ListaPrecioCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetallePrecioCompraRepository extends JpaRepository<DetallePrecioCompra, Long> {
    List<DetallePrecioCompra> findByListaPrecioCompra(ListaPrecioCompra listaPrecioCompra);
}
