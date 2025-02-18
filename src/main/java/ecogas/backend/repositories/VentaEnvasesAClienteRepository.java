package ecogas.backend.repositories;

import ecogas.backend.models.Cliente;
import ecogas.backend.models.VentaEnvasesACliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VentaEnvasesAClienteRepository extends JpaRepository<VentaEnvasesACliente, Long> {
    List<VentaEnvasesACliente> findByCliente(Cliente cliente);
}
