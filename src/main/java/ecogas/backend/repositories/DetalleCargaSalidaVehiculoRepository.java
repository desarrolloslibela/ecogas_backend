package ecogas.backend.repositories;

import ecogas.backend.models.DetalleCargaSalidaVehiculo;
import ecogas.backend.models.RegistroSalidaVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleCargaSalidaVehiculoRepository extends JpaRepository<DetalleCargaSalidaVehiculo, Long> {
    List<DetalleCargaSalidaVehiculo> findByRegistroSalidaVehiculo(RegistroSalidaVehiculo registro);
}
