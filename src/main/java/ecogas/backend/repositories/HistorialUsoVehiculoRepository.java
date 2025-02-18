package ecogas.backend.repositories;

import ecogas.backend.models.HistorialUsoVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface HistorialUsoVehiculoRepository extends JpaRepository<HistorialUsoVehiculo, Long> {
    List<HistorialUsoVehiculo> findByFecha (LocalDate fecha);
}
