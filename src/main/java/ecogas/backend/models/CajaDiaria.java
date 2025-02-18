package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class CajaDiaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;
    private Double saldoInicial;
    private Double ingresosEfectivo;
    private Double ingresosTransferencia;
    private Double egresos;
    private Double saldoFinal;
    @ManyToOne
    private Usuario responsableCierre;

}
