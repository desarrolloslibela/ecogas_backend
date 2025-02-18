package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class DetalleRutaEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private RutaEntrega rutaEntrega;

    @ManyToOne
    private Cliente cliente;

    private Integer orden;
    private Boolean entregaRealizada;
}
