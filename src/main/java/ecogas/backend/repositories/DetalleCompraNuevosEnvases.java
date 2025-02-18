package ecogas.backend.repositories;

import ecogas.backend.models.CompraNuevosEnvases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface DetalleCompraNuevosEnvases extends JpaRepository<CompraNuevosEnvases, Long> {
    List<DetalleCompraNuevosEnvases> findByCompraNuevosEnvases(CompraNuevosEnvases compraNuevosEnvases);
}