package ecogas.backend.repositories;

import ecogas.backend.models.GastoVehiculo;
import ecogas.backend.models.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GastoVehiculoRepository extends JpaRepository<GastoVehiculo, Long> {
    List<GastoVehiculo> findByVehiculo(Vehiculo vehiculo);
}