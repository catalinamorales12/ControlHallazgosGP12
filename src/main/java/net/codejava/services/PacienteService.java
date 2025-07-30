package net.codejava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.codejava.entity.Paciente;
import net.codejava.repositories.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepo;

    public Paciente guardarPaciente(Paciente paciente) {
        return pacienteRepo.save(paciente);
    }

    public Paciente buscarPorNombreUsuario(String nombreUsuario) {
        return pacienteRepo.findByNombreUsuario(nombreUsuario);
    }

    public Paciente getPaciente(Long id) {
        return pacienteRepo.findById(id).orElse(null);
    }
}
