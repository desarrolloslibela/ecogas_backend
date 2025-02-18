package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class DetallePrecioCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ListaPrecioCompra listaPrecioCompra;

    @ManyToOne
    private TipoEnvase tipoEnvase;

    private Double precioUnitario;
}
