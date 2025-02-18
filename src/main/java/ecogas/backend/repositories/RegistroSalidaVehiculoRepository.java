package ecogas.backend.repositories;

import ecogas.backend.models.RegistroSalidaVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RegistroSalidaVehiculoRepository extends JpaRepository<RegistroSalidaVehiculo, Long> {
    List<RegistroSalidaVehiculo> findByFechaSalida(LocalDate fecha);
}
