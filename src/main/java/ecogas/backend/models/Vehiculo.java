package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String patente;
}
