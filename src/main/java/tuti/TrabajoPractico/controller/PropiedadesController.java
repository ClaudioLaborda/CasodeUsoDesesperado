package tuti.TrabajoPractico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



/**
 * CAPA: CONTROLADOR (Presentación / Web)
 * * FUNCIÓN PRINCIPAL: Es el recepcionista del sistema web. 
 * Atiende las URLs que el usuario escribe en el navegador, recibe los clics de los botones,
 * le pide ayuda a la capa de Servicio para procesar datos, y decide qué pantalla HTML mostrar.
 */

@Controller 
public class PropiedadesController {

    @GetMapping("/propiedades/alta")
    public String mostrarFormulario() {
        return "propiedad"; // Levanta el HTML que solo tiene el título <h2>
    }
}