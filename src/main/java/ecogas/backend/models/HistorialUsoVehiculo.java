package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;


@Data
@Entity
public class HistorialUsoVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Vehiculo vehiculo;

    @ManyToOne
    private Usuario chofer;

    private LocalDate fecha;
}
