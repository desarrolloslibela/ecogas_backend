package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class StockCasaCentral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private TipoEnvase tipoEnvase;

    private Integer cantidadLlenos;
    private Integer cantidadVacios;
}

