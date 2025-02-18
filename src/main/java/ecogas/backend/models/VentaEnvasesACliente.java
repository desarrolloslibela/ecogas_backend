package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class VentaEnvasesACliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "compraEnvasesCliente")
    private List<DetalleVentaEnvasesACliente> detalles;

    private Double montoTotal;

    @ManyToOne
    private MetodoPago metodoPago;
}