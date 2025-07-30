package net.codejava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import net.codejava.entity.Paciente;
import net.codejava.entity.CalculoIMC;
import net.codejava.services.PacienteService;
import net.codejava.services.CalculoIMCService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AppController {

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private CalculoIMCService calculoIMCService;

    // Redirigir la raíz al login
    @GetMapping("/")
    public String redirigirARaiz() {
        return "redirect:/login";
    }

    // Página registro
    @GetMapping("/registro")
    public String mostrarRegistro(Model model) {
        model.addAttribute("paciente", new Paciente());
        return "registro";
    }

    // Guardar registro
    @PostMapping("/registro")
    public String registrarPaciente(@ModelAttribute Paciente paciente, Model model) {
        // Validaciones básicas
        if (paciente.getEdad() < 15 || paciente.getEstatura() < 1 || paciente.getEstatura() > 2.5
            || paciente.getNombreUsuario() == null || paciente.getNombreUsuario().isEmpty()
            || paciente.getContrasena() == null || paciente.getContrasena().isEmpty()) {

            model.addAttribute("error", "Datos inválidos o incompletos.");
            return "registro";
        }

        // Verificar si usuario ya existe
        if (pacienteService.buscarPorNombreUsuario(paciente.getNombreUsuario()) != null) {
            model.addAttribute("error", "Nombre de usuario ya existe.");
            return "registro";
        }

        // Aquí deberías hashear la contraseña antes de guardar
        pacienteService.guardarPaciente(paciente);
        return "redirect:/login";
    }

    // Página login
    @GetMapping("/login")
    public String mostrarLogin() {
        return "login";
    }

    // Procesar login
    @PostMapping("/login")
    public String login(@RequestParam String nombreUsuario,
                        @RequestParam String contrasena,
                        HttpSession session,
                        Model model) {
        Paciente paciente = pacienteService.buscarPorNombreUsuario(nombreUsuario);
        if (paciente == null || !paciente.getContrasena().equals(contrasena)) {
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "login";
        }
        session.setAttribute("paciente", paciente);
        return "redirect:/calcular";
    }

    // Página para ingresar peso y calcular IMC
    @GetMapping("/calcular")
    public String mostrarCalculo(HttpSession session, Model model) {
        Paciente paciente = (Paciente) session.getAttribute("paciente");
        if (paciente == null) {
            return "redirect:/login";
        }
        model.addAttribute("peso", "");
        return "calcular";
    }

    // Procesar cálculo IMC
    @PostMapping("/calcular")
    public String calcularIMC(HttpSession session,
                              @RequestParam double peso,
                              Model model) {
        Paciente paciente = (Paciente) session.getAttribute("paciente");
        if (paciente == null) {
            return "redirect:/login";
        }
        if (peso <= 0) {
            model.addAttribute("error", "Peso debe ser mayor que 0");
            model.addAttribute("peso", peso);
            return "calcular";
        }
        double imc = peso / (paciente.getEstatura() * paciente.getEstatura());
        CalculoIMC nuevoCalculo = new CalculoIMC(paciente, peso, imc);
        calculoIMCService.guardarCalculo(nuevoCalculo);
        return "redirect:/historial";
    }

    // Mostrar historial de IMC
   @GetMapping("/historial")
public String mostrarHistorial(HttpSession session, Model model) {
    Paciente paciente = (Paciente) session.getAttribute("paciente");
    if (paciente == null) {
        return "redirect:/login";
    }
    List<CalculoIMC> historial = calculoIMCService.obtenerHistorial(paciente);
    model.addAttribute("historial", historial);
    model.addAttribute("nombrePaciente", paciente.getNombre()); // <-- Agrega esto
    return "historial";
}

    // Logout
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}