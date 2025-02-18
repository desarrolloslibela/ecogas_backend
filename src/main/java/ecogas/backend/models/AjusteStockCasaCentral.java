package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class AjusteStockCasaCentral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fecha;

    @ManyToOne
    private TipoEnvase tipoEnvase;

    private Integer cantidadLlenosAjuste;
    private Integer cantidadVaciosAjuste;
    private String motivo;

    @ManyToOne
    private Usuario registradoPor;
}
