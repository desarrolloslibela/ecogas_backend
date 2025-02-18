package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Usuario chofer;

    @ManyToOne
    private Vehiculo vehiculo;

    @ManyToOne
    private ListaPrecioVenta listaPrecioVenta;

    @OneToMany(mappedBy = "entrega")
    private List<DetalleEntrega> detalles;

    private Double total;

    private MetodoPago metodoPago;
}

