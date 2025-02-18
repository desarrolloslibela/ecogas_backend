package ecogas.backend.repositories;

import ecogas.backend.models.DetalleRegistroLlegada;
import ecogas.backend.models.RegistroLlegadaVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleRegistroLlegadaRepository extends JpaRepository<DetalleRegistroLlegada, Long> {
    List<DetalleRegistroLlegada> findByRegistroLlegadaVehiculo(RegistroLlegadaVehiculo registro);
}
