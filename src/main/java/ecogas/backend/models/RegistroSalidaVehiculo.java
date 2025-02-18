package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class RegistroSalidaVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaSalida;

    @ManyToOne
    private Vehiculo vehiculo;

    @ManyToOne
    private Usuario chofer;

    @OneToMany(mappedBy = "detalleCargaSalidaVehiculo")
    private List<DetalleCargaSalidaVehiculo> detalles;
}
