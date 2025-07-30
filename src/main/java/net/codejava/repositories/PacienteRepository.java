package net.codejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import net.codejava.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Paciente findByNombreUsuario(String nombreUsuario);  // para login
}
