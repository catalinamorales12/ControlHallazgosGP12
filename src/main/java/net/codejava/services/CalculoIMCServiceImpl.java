package net.codejava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.codejava.entity.CalculoIMC;
import net.codejava.entity.Paciente;
import net.codejava.repositories.CalculoIMCRepository;
import java.util.List;

@Service
public class CalculoIMCServiceImpl implements CalculoIMCService {

    @Autowired
    private CalculoIMCRepository repo;

    @Override
    public CalculoIMC guardarCalculo(CalculoIMC calculo) {
        return repo.save(calculo);
    }

    @Override
    public List<CalculoIMC> obtenerHistorial(Paciente paciente) {
        return repo.findByPacienteOrderByFechaDesc(paciente);
    }
}