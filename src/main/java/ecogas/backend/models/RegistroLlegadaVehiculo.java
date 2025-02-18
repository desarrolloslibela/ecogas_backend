package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class RegistroLlegadaVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaLlegada;

    @ManyToOne
    private Vehiculo vehiculo;

    @ManyToOne
    private Usuario chofer;

    @OneToMany(mappedBy = "registroLlegadaVehiculo")
    private List<DetalleRegistroLlegada> detalles;
}
