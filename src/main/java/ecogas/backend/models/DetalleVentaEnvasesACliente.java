package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class DetalleVentaEnvasesACliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private VentaEnvasesACliente ventaEnvasesACliente;

    @ManyToOne
    private TipoEnvase tipoEnvase;

    private Integer cantidadComprada;

    private Double precioUnitario;
}
