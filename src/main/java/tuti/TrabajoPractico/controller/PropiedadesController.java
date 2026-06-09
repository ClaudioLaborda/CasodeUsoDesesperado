package tuti.TrabajoPractico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;





@Controller 
public class PropiedadesController {

    @GetMapping("/propiedades/alta") // http://localhost:8080/propiedades/alta
    public String mostrarFormulario() {
        return "propiedad"; // Levanta el HTML que solo tiene el título <h2>
    }
}