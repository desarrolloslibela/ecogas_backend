package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Entity
public class GastoVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private String descripcion;
    private Double monto;

    @ManyToOne
    private Vehiculo vehiculo;

    @ManyToOne
    private MetodoPago metodoPago;
}
