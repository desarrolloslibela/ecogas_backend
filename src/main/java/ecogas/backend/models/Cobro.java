package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;



@Data
@Entity
public class Cobro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private MetodoPago metodoPago;

    private Double monto;
}