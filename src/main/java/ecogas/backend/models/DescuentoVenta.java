package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class DescuentoVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private Double porcentajeDescuento;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;
}

