package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class DetalleCompraNuevosEnvases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CompraNuevosEnvases compraNuevosEnvases;

    @ManyToOne
    private TipoEnvase tipoEnvase;

    private Integer cantidad;
    private Double precioUnitario;
}
