package net.codejava.services;

import net.codejava.entity.CalculoIMC;
import net.codejava.entity.Paciente;
import java.util.List;

public interface CalculoIMCService {
    CalculoIMC guardarCalculo(CalculoIMC calculo);
    List<CalculoIMC> obtenerHistorial(Paciente paciente);
}
