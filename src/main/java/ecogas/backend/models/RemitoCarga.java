package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class RemitoCarga {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaCarga;

    @ManyToOne
    private Vehiculo vehiculo;

    @ManyToOne
    private Usuario chofer;

}
