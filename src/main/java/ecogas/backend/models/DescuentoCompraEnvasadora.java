package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Entity
public class DescuentoCompraEnvasadora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private Double montoDescuento;

    private LocalDate fechaAplicacion;
}
