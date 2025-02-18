package ecogas.backend.repositories;

import ecogas.backend.models.PosicionVehiculo;
import ecogas.backend.models.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PosicionVehiculoRepository extends JpaRepository<PosicionVehiculo, Long>{
    Optional<PosicionVehiculo> findTopByVehiculoOrderByTimestampDesc (Vehiculo vehiculo);
}