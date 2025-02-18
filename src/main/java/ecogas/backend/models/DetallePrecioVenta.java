package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class DetallePrecioVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ListaPrecioVenta listaPrecioVenta;

    @ManyToOne
    private TipoEnvase tipoEnvase;

    private Double precioUnitario;
}
