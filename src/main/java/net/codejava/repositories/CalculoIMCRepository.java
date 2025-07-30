package net.codejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import net.codejava.entity.CalculoIMC;
import net.codejava.entity.Paciente;
import java.util.List;

public interface CalculoIMCRepository extends JpaRepository<CalculoIMC, Long> {
    List<CalculoIMC> findByPacienteOrderByFechaDesc(Paciente paciente);
}
