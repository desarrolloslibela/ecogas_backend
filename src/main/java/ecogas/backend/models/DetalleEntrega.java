package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class DetalleEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Entrega entrega;

    @ManyToOne
    private TipoEnvase tipoEnvase;

    private Integer cantidadEntregada;
    private Integer cantidadRecibida;
}