package ecogas.backend.models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class RutaEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double puntoPartidaLatitud;
    private Double puntoPartidaLongitud;
    private Boolean activa;
    private LocalDate ultimaModificacion;
}
