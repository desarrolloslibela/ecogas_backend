package ecogas.backend.repositories;

import ecogas.backend.models.RegistroLlegadaVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RegistroLlegadaVehiculoRepository extends JpaRepository<RegistroLlegadaVehiculo, Long> {
    List<RegistroLlegadaVehiculo> findByFechaLlegada(LocalDate fecha);
}