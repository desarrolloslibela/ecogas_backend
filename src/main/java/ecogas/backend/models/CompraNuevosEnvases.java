package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class CompraNuevosEnvases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;

    private Proveedor proveedor;

    @ManyToOne
    private DetalleCompraNuevosEnvases detalleCompraNuevosEnvases;

    private Double total;
    private MetodoPago metodoPago;
}

