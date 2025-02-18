package ecogas.backend.repositories;

import ecogas.backend.models.VentaEnvasesACliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleVentaEnvasesACliente extends JpaRepository<DetalleVentaEnvasesACliente, Long> {
    List<DetalleVentaEnvasesACliente> findByVentaEnvasesACliente (VentaEnvasesACliente ventaEnvasesACliente);
}
